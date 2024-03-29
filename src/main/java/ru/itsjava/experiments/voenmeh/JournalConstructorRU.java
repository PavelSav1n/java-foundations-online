package ru.itsjava.experiments.voenmeh;

import ru.itsjava.experiments.voenmeh.parsers.AuthorParserRu;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JournalConstructorRU {
    public static void main(String[] args) {
        for (int articleNum = 1; articleNum <= 10; articleNum++) {


            File file = new File("src/main/resources/voenmeh/3/ru/3-" + articleNum);
            HashMap<String, String> journalArray = new HashMap<>();
            ArrayList<String> authorsArray = new ArrayList<>();
            ArrayList<String> workplace = new ArrayList<>();
            ArrayList<String> authorPlusWorkplace = new ArrayList<>();
            String annotation = null;
            String keywords = null;
            int findFlag = 0;
            // findFlag == 1 -- нашли ссылки у авторов
            // findFlag == 2 -- ссылок у авторов нет
            // findFlag == 3 -- если ссылок нет, то значит в workplace только одно место
            // findFlag == 4 -- если есть ссылки, но workplace больше, чем авторов.


            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String input;

                String category = reader.readLine().strip();
                journalArray.put("Категория", category);

                System.out.println("Первый проход");
                int rowCount = 1;
                while ((input = reader.readLine()) != null) {
                    System.out.println("Row:" + rowCount++);

//                    // Парсим авторов из тела журнала:
//                    Pattern pattern = Pattern.compile("[А-Я]\\.\\s+[А-Я]\\.\\s[А-Я][а-я]+[123456]");
//                    Matcher matcher = pattern.matcher(input);
//                    while (matcher.find()) {
//                        System.out.println(matcher.group());
//                        authorsArray.add(matcher.group());
//                        findFlag = 1;
//                        System.out.println("Нашли ссылки!");
//                    }
//                    if (findFlag == 1) {
//                        // Парсим место работы авторов
//                        if (input.startsWith("¹")) {
//                            StringBuilder body = new StringBuilder();
//                            while (!input.contains("Российская Федерация")) {
//                                body.append(input);
//                                input = reader.readLine();
//                                System.out.println("Row:" + rowCount++);
//                            }
//                            workplace.add(body + " " + input);
//                        }
//                        if (input.startsWith("²")) {
//                            StringBuilder body = new StringBuilder();
//                            while (!input.contains("Российская Федерация")) {
//                                body.append(input);
//                                input = reader.readLine();
//                                System.out.println("Row:" + rowCount++);
//                            }
//                            workplace.add(body + " " + input);
//                        }
//                        if (input.startsWith("³")) {
//                            StringBuilder body = new StringBuilder();
//                            while (!input.contains("Российская Федерация")) {
//                                body.append(input);
//                                input = reader.readLine();
//                                System.out.println("Row:" + rowCount++);
//                            }
//                            workplace.add(body + " " + input);
//                        }
//                    } else if (findFlag != 2) {
//                        // Парсим авторов из тела журнала:
//                        pattern = Pattern.compile("[А-Я]\\.\\s+[А-Я]\\.\\s[А-Я][а-я]+");
//                        matcher = pattern.matcher(input);
//                        while (matcher.find()) {
//                            System.out.println(matcher.group());
//                            authorsArray.add(matcher.group());
//                            findFlag = 2;
//                        }
//                    }
//                    if (findFlag == 2) {
//                        System.out.println("Пишем БГТУ");
//                        if (input.startsWith("Балтийский государственный")) {
//                            StringBuilder body = new StringBuilder();
//                            while (!input.contains("Российская Федерация")) {
//                                body.append(input);
//                                input = reader.readLine();
//                                System.out.println("Row:" + rowCount++);
//                            }
//                            System.out.println(body + " " + input);
//                            workplace.add(body + " " + input);
//                            findFlag = 3;
//                        }
//                    }

                    // Парсим аннотацию:
                    if (input.startsWith("Аннотация.")) {
                        StringBuilder body = new StringBuilder();
                        while (!input.contains("Ключевые слова:")) {
                            body.append(input).append(" ");
                            input = reader.readLine();
                            System.out.println("Row:" + rowCount++);
                        }
                        annotation = body.toString();
                    }
                    // Парсим ключевые слова:
                    if (input.startsWith("Ключевые слова:")) {
                        StringBuilder body = new StringBuilder();
                        while (!input.contains("Для цитирования:")) {
                            body.append(input).append(" ");
                            input = reader.readLine();
                            System.out.println("Row:" + rowCount++);
                        }
                        keywords = body.toString();
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            // Устарело

//            // Совмещаем авторов и их место работы:
//            if (findFlag == 1) {
//                if (workplace.size() <= authorsArray.size()) { // Если у нас Авторов больше или столько же, сколько и мест работы
//                    for (int link = 1; link <= workplace.size(); link++) {
//                        for (int i = 0; i < authorsArray.size(); i++) {
//                            if (authorsArray.get(i).contains(Integer.toString(link))) {
//                                String newString = (authorsArray.get(i) + ", " + workplace.get(link - 1) // формируем одну строку
//                                ).replaceAll("[¹²³12345]", ""); // убираем ссылки
////                    journalArray.put(authorsArray.get(i).replaceAll("[¹²³12345]", ""), workplace.get(link - 1).replaceAll("[¹²³12345]", ""));
//                                authorPlusWorkplace.add(newString); // добавляем автора и его работу в список
//                            }
//                        }
//                    }
//                } else { // Если у нас авторов меньше чем мест работы. И. И. Иванов, СПБГУ, Microsoft
////                    for (int i = 0; i < authorsArray.size(); i++) {
////                        authorPlusWorkplace.add(authorsArray.get(i).replaceAll("[¹²³12345]", ""));
////                    }
////                    for (int i = 0; i < workplace.size(); i++) {
////                        authorPlusWorkplace.add(workplace.get(i).replaceAll("[¹²³12345]", "").trim());
////                    }
//                    findFlag = 4;
//                }
//            }

            journalArray.put("Аннотация", annotation.substring(11)); // не используется
            journalArray.put("Ключевые слова", keywords.substring(16)); // не используется


            // Второй проход, парсим заголовок:
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String input;

                System.out.println("Второй проход");
                int rowCount = 1;
                while ((input = reader.readLine()) != null) {

                    System.out.println(input);
                    System.out.println("Row:" + rowCount++);

                    if (input.startsWith("Для цитирования:")) {
                        StringBuilder body = new StringBuilder();
                        //TODO зафигачить while !input.contains("//")
                        while (!input.contains("//")) {
                            body.append(input).append(" ");
                            input = reader.readLine();
                        }
//                        journalArray.put("Заголовок", body.substring(17) + input.split("//")[0].trim());
                        journalArray.put("Заголовок", body.append(input.split("//")[0].trim()).substring(17));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            // Третий проход. Добавляем информацию для цитирования.
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String input;

                System.out.println("Третий проход");
                int rowCount = 1;
                while ((input = reader.readLine()) != null) {
                    StringBuilder body = new StringBuilder();
                    System.out.println(input);
                    System.out.println("Row:" + rowCount++);

                    if (input.startsWith("Для цитирования:")) {
                        while (input != null) {
                            body.append(input).append(" ");
                            input = reader.readLine();
                        }
//                        journalArray.put("Заголовок", body.substring(17) + input.split("//")[0].trim());
                        journalArray.put("Для цитирования", body.toString().trim().substring(17));
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

//        // Парсим авторов из заголовка expand:
//        String authors = journalArray.get("[expand title=\"");
//        // [А-Я][а-я]+\s+[А-Я]\.\s+[А-Я]\.
//        Pattern pattern = Pattern.compile("[А-Я][а-я]+\s+[А-Я].\s+[А-Я].");
//        Matcher matcher = pattern.matcher(authors);
//        while (matcher.find()) {
//            authorsArray.add(matcher.group());
//        }


            File fileOutput = new File(file.getPath() + ".out");
            try (PrintWriter printWriter = new PrintWriter(fileOutput)) {

                Pattern pattern = Pattern.compile("[А-Я][а-я].+\\s+[А-Я]\\.\\s+[А-Я]\\.");
                Matcher matcher = pattern.matcher(journalArray.get("Заголовок"));
                while (matcher.find()) {
                    String groupOfAuthors = matcher.group();
                    String title = journalArray.get("Заголовок").split("[А-Я][а-я].+\s+[А-Я]\\.\s+[А-Я]\\.")[1].strip();
                    printWriter.println("[expand title=\"<b>" + groupOfAuthors + "</b> " + title + "\"]");
                }
                printWriter.println();

                printWriter.println("<b>" + journalArray.get("Категория") + "</b>");
                printWriter.println();

                // Пишем авторов и их места работы в файл
                AuthorParserRu authorParserRu = new AuthorParserRu();
                ArrayList<String> authorAndWorkplaceList = authorParserRu.parser(file);

                for (int i = 0; i < authorAndWorkplaceList.size(); i++) {
                    printWriter.println(authorAndWorkplaceList.get(i));
                }

//                if (findFlag == 1) {
//                    for (int i = 0; i < authorPlusWorkplace.size(); i++) {
//                        printWriter.println(authorPlusWorkplace.get(i));
//                    }
//                } else if (findFlag == 3) {
//                    for (int i = 0; i < authorsArray.size(); i++) {
//                        printWriter.print(authorsArray.get(i) + ", ");
//                    }
//                    printWriter.println(workplace.get(0));
//                } else if (findFlag == 4) {
//                    for (int i = 0; i < authorsArray.size(); i++) {
//                        printWriter.print(authorsArray.get(i).replaceAll("[¹²³12345]", "") + ", ");
//                        for (int j = 0; j < workplace.size(); j++) {
//                            if (j != workplace.size() - 1) {
//                                printWriter.print(workplace.get(j).replaceAll("[¹²³12345]", "") + ", "); // добавляем кучу workplace
//                            } else printWriter.print(workplace.get(j).replaceAll("[¹²³12345]", ""));
//                        }
//                    }
//                    printWriter.println();
//                }

                printWriter.println();
                printWriter.println("<b>Аннотация:</b> " + annotation.substring(11));
                printWriter.println();
                printWriter.println("<b>Ключевые слова:</b> " + keywords.substring(16));
                printWriter.println();
                printWriter.println("<b>Для цитирования: </b>" + journalArray.get("Для цитирования"));
                printWriter.println();
                printWriter.println("<div class=\"wp-block-buttons\"><!-- wp:button {\"style\":{\"border\":{\"radius\":\"0px\"},\"color\":{\"background\":\"#0077c8\"},\"typography\":{\"textTransform\":\"uppercase\",\"fontStyle\":\"normal\",\"fontWeight\":\"800\"}},\"className\":\"is-style-fill\",\"fontSize\":\"medium\"} -->\n" +
                        "<div class=\"wp-block-button has-custom-font-size is-style-fill has-medium-font-size\" style=\"font-style:normal;font-weight:800;\"><a class=\"wp-block-button__link has-background wp-element-button\" href=\"http://aerocosmtech.ru/wp-content/uploads/2023/10/Том-1-выпуск-3-2023-" + articleNum + "-ст.pdf\" style=\"border-radius:0px;background-color:#0077c8;padding: 0 15px 0 15px;font-weight: 600;font-size: 12px;line-height: 40px;\">Скачать статью</a></div>\n" +
                        "<!-- /wp:button --></div>");
                printWriter.println("[/expand]");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
