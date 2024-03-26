package ru.itsjava.experiments.voenmeh.parsers;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AuthorParserRu {

    // метод, который будет парсить
    public ArrayList<String> parser(File file) throws IOException {

        ArrayList<String> authorsArray = new ArrayList<>(); // список, авторов
        ArrayList<String> workplaceArray = new ArrayList<>(); // список, их мест работы
        // findFlag == 1 -- нашли ссылки у авторов
        // findFlag == 2 -- ссылок у авторов нет
        // findFlag == 3 -- если ссылок нет, то значит в workplace только одно место
        // findFlag == 4 -- если есть ссылки, но workplace больше, чем авторов.
        // findFlag == 5 -- ссылок у авторов нет, сформированы списки авторов и мест работы
        int findFlag = 0;
        int rowCount = 0;
        String input; // входящая строка


        // ВНИМАНИЕ!!
        // Проходим, заполняем список авторов. В английской версии может быть E. Yu. Potanina и даже ZhenNing Li-- Это пизда -- я пока хз блять что делать. Просто руками пока.
        // Более того вот такая хурма отпарсится как один автор, поэтому разбиваем строку вручную на две "В. М. Мальков1,2, А. В. Емельянова2"

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            input = reader.readLine();
            while (!input.contains("Аннотация") && !input.contains("Abstract")) { // идём до строки, содержащей "Аннотация"
                // Паттерн с ссылками:
                Pattern pattern = Pattern.compile("([A-Z]|[А-Я])\\.\\s+([A-Z]|[А-Я])\\.\\s(([A-Z]|[А-Я])|([a-z]|[а-я]))+(([123456].+)|([123456]))");
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    authorsArray.add(matcher.group()); // Помещаем авторов со своими сносками. Например "С. А. Мешков1" и "С. А. Мешков12"
                    findFlag = 1;
                }
                // Если нашли сноски, то значит не проверяем паттерном без сносок, потому что он тот же самый, только без цифр в конце типа в "С. А. Мешков1" найдёт "С. А. Мешков" и поместит в список авторов
                // Ищет "С. И. Косяков, С. Н. Куличков, А. А. Мишенин ..."
                // Игнорирует авторов во второй и более строках
                if (findFlag == 0) { // Если сносок нет, значит парсим авторов без цифр в конце "С. А. Мешков"
                    pattern = Pattern.compile("([A-Z]|[А-Я])\\.\\s+([A-Z]|[А-Я])\\.\\s(([A-Z]|[А-Я])|([a-z]|[а-я]))+"); //Паттерн без ссылок
                    matcher = pattern.matcher(input);
                    while (matcher.find()) {
                        authorsArray.add(matcher.group());
                        findFlag = 2;
                    }
                }
                input = reader.readLine(); // идём к следующей строке
            }
        }


        System.out.println("************* Authors Array List filled!  ******************");
        System.out.println("authorsArray.size() = " + authorsArray.size());
        for (String s : authorsArray) {
            System.out.println(s);
        }


        // Проходим второй раз, заполняем список мест работы:
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            input = reader.readLine();
            while (!input.contains("Аннотация") && !input.contains("Abstract")) { // идём до строки, содержащей "Аннотация"
                // Если нашли ссылки, то парсим место работы:
                // Надо убедиться, что нет строк, начинающихся с цифр до "Аннотация", кроме мест работы
                // А там будут, потому что номер страницы тоже копируется.
                if (findFlag == 1) {
                    // Парсим место работы авторов
                    if (input.startsWith("¹")) {
                        StringBuilder body = new StringBuilder();
                        while (!input.contains("Российская Федерация") && !input.contains("Russian Federation") && !input.contains("Великобритания") && !input.contains("United Kingdom")) {
                            body.append(input);
                            input = reader.readLine();
                        }
                        workplaceArray.add(body + " " + input);
                    }
                    if (input.startsWith("²")) {
                        StringBuilder body = new StringBuilder();
                        while (!input.contains("Российская Федерация") && !input.contains("Russian Federation") && !input.contains("Великобритания") && !input.contains("United Kingdom")) {
                            body.append(input);
                            input = reader.readLine();
                        }
                        workplaceArray.add(body + " " + input);
                    }
                    if (input.startsWith("³")) {
                        StringBuilder body = new StringBuilder();
                        while (!input.contains("Российская Федерация") && !input.contains("Russian Federation") && !input.contains("Великобритания") && !input.contains("United Kingdom")) {
                            body.append(input);
                            input = reader.readLine();
                        }
                        workplaceArray.add(body + " " + input);
                    }
                } else {
                    // Если ссылок нет, то придётся поебаться.
                    // Нам нужен промежуток между последним найденным автором без ссылки и строкой начинающейся с "Аннотация"
                    Pattern pattern = Pattern.compile("([A-Z]|[А-Я])\\.\\s+([A-Z]|[А-Я])\\.\\s(([A-Z]|[А-Я])|([a-z]|[а-я]))+"); //Паттерн без ссылок
                    Matcher matcher = pattern.matcher(input);
                    while (matcher.find()) { // если нашли, нужно убедиться, что это последний
                        findFlag = 5;
                        System.out.println("matcher.group() = " + matcher.group());
                        // тут какая-то ебанина со тредами происходит, отладка показывает разные данные, поэтому цикл while прогоняет все матчи, после чего мы точно попадаем между авторами и аннотацией
                    }
                    if (findFlag == 5) {
                        StringBuilder stringBuilder = new StringBuilder();
                        if (workplaceArray.size() == 0) {
                            while (!input.contains("Российская Федерация") && !input.contains("Russian Federation")) {
                                input = reader.readLine();
                                stringBuilder.append(input);
                            }
                        } else {
                            while (!input.contains("Российская Федерация") && !input.contains("Russian Federation")) {
                                stringBuilder.append(input);
                                input = reader.readLine();
                                stringBuilder.append(input);
                            }
                        }
                        workplaceArray.add(stringBuilder.toString());
                    }
                }
                input = reader.readLine(); // идём к следующей строке
            }
        }

        System.out.println("************* Workplace Array List filled!  ******************");
        System.out.println("workplaceArray.size() = " + workplaceArray.size());
        for (String s : workplaceArray) {
            System.out.println(s);
        }

        // Теперь нужно сопоставить рабочие места и авторов.
        // Логика такова, если нет ссылок, то значит все авторы в одну строку и после через запятую идут места их работы.
        // Если ссылки есть, то парсим числа в конце фамилии автора (может быть несколько) и сопоставляем номера мест по ссылкам.

        StringBuilder firstRow = new StringBuilder();
        StringBuilder secondRow = new StringBuilder();
        StringBuilder thirdRow = new StringBuilder();
        StringBuilder forthRow = new StringBuilder();
        StringBuilder oneTwoRow = new StringBuilder();
        StringBuilder twoThreeRow = new StringBuilder();

        ArrayList<String> authorsAndWorkplaceList = new ArrayList<>();

        if (findFlag == 1) {
            for (String s : authorsArray) { // сортируем авторов
                // Все авторы типа Иванов1
                if (s.contains("1") && !(s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5"))) {
                    firstRow.append(s.replace("1", "").trim() + ", ");
                }
                // Все авторы типа Иванов2
                if (s.contains("2") && !(s.contains("1") || s.contains("3") || s.contains("4") || s.contains("5"))) {
                    secondRow.append(s.replace("2", "").trim() + ", ");
                }
                // Все авторы типа Иванов3
                if (s.contains("3") && !(s.contains("1") || s.contains("2") || s.contains("4") || s.contains("5"))) {
                    thirdRow.append(s.replace("3", "").trim() + ", ");
                }
                // Все авторы типа Иванов4
                if (s.contains("4") && !(s.contains("1") || s.contains("2") || s.contains("3") || s.contains("5"))) {
                    forthRow.append(s.replace("4", "").trim() + ", ");
                } // Все авторы типа Иванов1,2
                if (s.contains("1") && (s.contains("2"))) {
                    oneTwoRow.append(s.replaceAll("[123456]|[,]", "").trim() + ", ");
                } // Все авторы типа Иванов2, 3
                if (s.contains("2") && (s.contains("3"))) {
                    twoThreeRow.append(s.replaceAll("[123456]|[,]", "").trim() + ", ");
                }
            }

            System.out.println("firstRow = " + firstRow);
            System.out.println("secondRow = " + secondRow);
            System.out.println("thirdRow = " + thirdRow);
            System.out.println("forthRow = " + forthRow);
            System.out.println("oneTwoRow = " + oneTwoRow);
            System.out.println("twoThreeRow = " + twoThreeRow);

            // Добавляем наборам авторов места работы:
            if (!firstRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(firstRow).append(workplaceArray.get(0).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }
            if (!oneTwoRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(oneTwoRow).append(workplaceArray.get(0).replaceAll("[¹²³12345]", "")).append(", ").append(workplaceArray.get(1).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }
            if (!secondRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(secondRow).append(workplaceArray.get(1).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }
            if (!twoThreeRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(twoThreeRow).append(workplaceArray.get(1).replaceAll("[¹²³12345]", "")).append(", ").append(workplaceArray.get(2).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }
            if (!thirdRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(thirdRow).append(workplaceArray.get(2).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }
            if (!forthRow.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(forthRow).append(workplaceArray.get(3).replaceAll("[¹²³12345]", "").trim());
                authorsAndWorkplaceList.add(stringBuilder.toString());
            }


        } else { // Если у нас нет ссылок у авторов, значит пихаем их в одну строку и добавляем место работы.
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : authorsArray) {
                stringBuilder.append(s).append(", ");
            }
            // На случай, если у нас там несколько мест работы, просто через запятую будут
            for (int i = 0; i < workplaceArray.size(); i++) {
                stringBuilder.append(workplaceArray.get(i)).append(", ");
            }
            authorsAndWorkplaceList.add(stringBuilder.deleteCharAt(stringBuilder.length() - 2).toString().trim());

        }

        for (String s : authorsAndWorkplaceList) {
            System.out.println("s = " + s);
        }

        return authorsAndWorkplaceList;
    }

}