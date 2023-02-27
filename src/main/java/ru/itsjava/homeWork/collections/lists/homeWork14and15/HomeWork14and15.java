package ru.itsjava.homeWork.collections.lists.homeWork14and15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork14and15 {
    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("0. Создание списков: (Используя конструктор)");
        System.out.println("а). Создать пустой список книг:");
        List<Book> booksListZeroElements = new ArrayList<>();
        System.out.println("booksList.size() = " + booksListZeroElements.size());

        System.out.println("*******************************");
        System.out.println("б). Создать список размером 20");
        // Наверно тут имеется в виду initialCapacity.
        List<Book> booksList20Capacity = new ArrayList<>(20);

        // Однако размер у него будет по прежнему 0 и он не будет содержать никаких элементов:
        System.out.println("booksList.size() = " + booksList20Capacity.size());
        System.out.println("booksList = " + booksList20Capacity);

        // Если необходим размер списка 20, то необходимо его заполнить чем-то:
        for (int i = 0; i < 20; i++) {
            booksList20Capacity.add(null);
        }
        // Заполнили null элементами, размер стал 20:
        System.out.println("booksList.size() = " + booksList20Capacity.size());
        System.out.println("booksList = " + booksList20Capacity);

        System.out.println("*******************************");
        System.out.println("1. Задача на вставку элемента:");
        // Объекты 20 книг Стругацких, переменные которых будут равны году их первой публикации, а количество страниц -- произвольное значение.
        // Из них используем только 7 + Добавил 4 книги со словом JAVA в названии:
        Book book1959 = new Book("Страна багровых туч", "Аркадий и Борис Стругацкие", 123);
        Book book1960 = new Book("Извне", "Аркадий и Борис Стругацкие", 231);
        Book book1960_2 = new Book("Путь на Амальтею", "Аркадий и Борис Стругацкие", 321);
        Book book1961 = new Book("Полдень, XXII век", "Аркадий и Борис Стругацкие", 323);
        Book book1962 = new Book("Стажёры", "Аркадий и Борис Стругацкие", 235);
        Book book1962_2 = new Book("Попытка к бегству", "Аркадий и Борис Стругацкие", 156);
        Book book1963 = new Book("Далёкая Радуга", "Аркадий и Борис Стругацкие", 327);
//        Book book1964 = new Book("Трудно быть богом", "Аркадий и Борис Стругацкие", 525);
//        Book book1965 = new Book("Понедельник начинается в субботу", "Аркадий и Борис Стругацкие", 376);
//        Book book1965_2 = new Book("Хищные вещи века", "Аркадий и Борис Стругацкие", 543);
//        Book book1965_3 = new Book("Беспокойство", "Аркадий и Борис Стругацкие", 721);
        Book bookJava = new Book("Java", "Some Author", 435);
        Book bookJava2 = new Book("Java", "Some Author", 65);
        Book bookJava3 = new Book("Java", "Some Author", 670);
        Book bookJava4 = new Book("Java", "Some Author", 234);
        Book bookAuthorThree = new Book("Author Three Letter", "Три", 123);
        Book bookAuthorSix = new Book("Author Six Letter", "Шеесть", 123);

//        Book book1966 = new Book("Улитка на склоне", "Аркадий и Борис Стругацкие", 243);
//        Book book1967 = new Book("Гадкие лебеди", "Аркадий и Борис Стругацкие", 987);
//        Book book1968 = new Book("Второе нашествие марсиан", "Аркадий и Борис Стругацкие", 234);
//        Book book1968_2 = new Book("Сказка о Тройке", "Аркадий и Борис Стругацкие", 103);
//        Book book1969 = new Book("Обитаемый остров", "Аркадий и Борис Стругацкие", 204);
//        Book book1970 = new Book("Отель „У Погибшего Альпиниста“", "Аркадий и Борис Стругацкие", 473);
//        Book book1971 = new Book("Малыш“", "Аркадий и Борис Стругацкие", 321);
//        Book book1972 = new Book("Пикник на обочине“", "Аркадий и Борис Стругацкие", 765);
//        Book book1974 = new Book("Парень из преисподней“", "Аркадий и Борис Стругацкие", 678);
//        Book book1976 = new Book("За миллиард лет до конца света“", "Аркадий и Борис Стругацкие", 456);

        List<Book> bookList = new ArrayList<>();

        System.out.println("*******************************");
        System.out.println("а) Добавить подряд 5 элементов:");
        bookList.add(book1959);
        bookList.add(book1960);
        bookList.add(book1960_2);
        bookList.add(book1961);
        bookList.add(book1962);
        System.out.println("bookList.size() = " + bookList.size());

        System.out.println("*******************************");
        System.out.println("Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию:");
        // Если имеется в виду последовательные действия, то это выглядит так:
        bookList.add(2, book1962_2); // Шестой элемент в третьей позиции
        bookList.add(0, book1963); // Седьмой элемент в первой (всё остальное смещается вправо и теперь шестой элемент в 4й позиции)
        System.out.println("bookList.size() = " + bookList.size());
        System.out.println("bookList = " + bookList);
        // Если имелось в виду одновременное выполнение, где у нас есть список в котором шестой элемент в третьей позиции, а седьмой в первой, то надо делать так:
        // bookList.add(1, book1962_2);
        // bookList.add(0, book1963);

        System.out.println("*******************************");
        System.out.println("Записать в новый список все элементы предыдущего списка");
        // Создаём новый список:
        List<Book> newBooksList = new ArrayList<>();
        // Копируем все элементы предыдущего списка в новый:
        newBooksList.addAll(bookList);
        System.out.println("newBooksList.size() = " + newBooksList.size());
        System.out.println("bookList.equals(newBooksList) = " + bookList.equals(newBooksList));

        System.out.println("*******************************");
        System.out.println("2. Получить элемент по индексу.");
        System.out.println("а). Получить первый элемент (первую книгу в списке):");
        System.out.println("bookList.get(0) = " + bookList.get(0));

        System.out.println("*******************************");
        System.out.println("б). Получить последний элемент (последнюю книгу в списке):");
        System.out.println("bookList.get(bookList.size() - 1) = " + bookList.get(bookList.size() - 1));

        System.out.println("*******************************");
        System.out.println("3. Задачи на удаление элементов: (Используя методы)");
        System.out.println("а) Удалить элемент по значению (книге):");
        bookList.remove(book1959);
        System.out.println("bookList.size() = " + bookList.size());
        System.out.println("bookList = " + bookList);

        System.out.println("*******************************");
        System.out.println("б) Удалить элемент по индексу:");
        bookList.remove(5);
        System.out.println("bookList.size() = " + bookList.size());
        System.out.println("bookList = " + bookList);

        System.out.println("*******************************");
        System.out.println("4. Проверить наличие элемента:");
        System.out.println("bookList.contains(book1959) = " + bookList.contains(book1959));
        System.out.println("bookList.contains(book1960) = " + bookList.contains(book1960));

        System.out.println("*******************************");
        System.out.println("5. Вывод списка");
//        а) Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
//        Book{"Java. Эффективное программирование", "Блох Дж.", 219};]

        System.out.print("bookList: [ ");
        for (int i = 0; i < bookList.size(); i++) {
            if (i == bookList.size() - 1) {
                System.out.print(bookList.get(i) + ";");
            } else {
                System.out.println(bookList.get(i) + ";");
            }
        }
        System.out.println("]");


//        ********************** homework 15 begin **********************
        System.out.println("********************** homework 15 begin **********************");

//        добавить 4 книги с названием "Java"
        bookList.add(bookJava);
        bookList.add(bookJava2);
        bookList.add(bookJava3);
        bookList.add(bookJava4);

        System.out.println("*******************************");
        System.out.println("6. Отфильтровать список вернуть записи по некоторому условию:");
        System.out.println("а) Условие на индекс: Индекс делится на 3");
        for (int i = 3; i < bookList.size(); i++) {
            if (i % 3 == 0) {
                System.out.println("bookList.get(" + i + ") = " + bookList.get(i));
            }
        }

        System.out.println("*******************************");
        System.out.println("б) Условие на значение: Вернуть количество книг, которые равны \"Java\"");
        for (Book bookElem : bookList) {
            if (bookElem.getName().equals("Java")) {
                System.out.println(" -- " + bookElem);
            }
        }

        System.out.println("*******************************");
        System.out.println("7. Пропустить несколько первых элементов");
        System.out.println("а) Пропустить первые 3 книги в списке.");
        int numberOfBooksToSkip = 3;
        for (int i = numberOfBooksToSkip; i < bookList.size(); i++) {
            System.out.println("bookList.get(" + i + ") = " + bookList.get(i));
        }

        System.out.println("*******************************");
        System.out.println("6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию");
        System.out.println("а) Пропустить первые 2 книги, которые равные \"Java\"");
        numberOfBooksToSkip = 2;
        int javaBooksCount = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equals("Java") && javaBooksCount < numberOfBooksToSkip) {
                javaBooksCount++;
            } else {
                System.out.println("bookList.get(" + i + ") = " + bookList.get(i));
            }
        }

        System.out.println("*******************************");
        System.out.println("8. Вернуть первый подходящий элемент:");
        System.out.println("а) Возвращаем первую книгу, длина автора которого делится на 3.");
        bookList.add(bookAuthorThree); // добавляем хотя бы одну книгу, длина имени автора которого делится на три
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println("bookList.get(" + i + ") = " + bookList.get(i));
                break;
            }
        }

        System.out.println("*******************************");
        System.out.println("9. Возвращаем все элементы удовлетворяющие условию:");
        System.out.println("а) Возвращаем все книги, длина автора которых делится на 3.");
        bookList.add(bookAuthorSix); // добавляем ещё одну книгу, длина имени автора которого делится на три
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println("bookList.get(" + i + ") = " + bookList.get(i));
            }
        }

        System.out.println("*******************************");
        System.out.println("10. Создать класс Person.( Поля: имя, возраст и пол isMale )");
        System.out.println("Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");

        Person igor = new Person("Игорь", 18, true);
        Person petr = new Person("Пётр", 28, true);
        Person nicolay = new Person("Николай", 23, true);
        Person nadya = new Person("Надя", 23, false);
        Person nikita = new Person("Никита", 29, true);
        Person anna = new Person("Анна", 54, false);
        Person nestor = new Person("Нестор", 19, true);
        Person nina = new Person("Нина", 26, false);
        Person nicolay2 = new Person("Николай", 17, true);

        List<Person> personList = new ArrayList<>(Arrays.asList(igor, petr, nicolay, nadya, nikita, anna, nestor, nina, nicolay2));

        for (Person personElem : personList) {
            if (personElem.isMale() && personElem.getAge() >= 18 && personElem.getAge() < 27 && personElem.getName().startsWith("Н")) {
                System.out.println(personElem);
            }
        }

        System.out.println("*******************************");
        System.out.println("11. Найти средний возраст всех женщин.");
        int sumOfAllAges = 0;
        int femaleCount = 0;
        for (Person personElem : personList) {
            if (!personElem.isMale()) {
                femaleCount++;
                sumOfAllAges = sumOfAllAges + personElem.getAge();
            }
        }
        System.out.println("Average age of all woman = " + sumOfAllAges / femaleCount);


    }
}
