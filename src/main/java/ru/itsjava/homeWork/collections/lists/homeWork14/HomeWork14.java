//Создать класс Книга (C полями: Название, Автор, количество страниц)
//        Списки:
//        0. Создание списков: (Используя конструктор)
//        а). Создать пустой список книг
//        б). Создать список размером 20
//
//        1. Задачи на вставку элемента:
//        а) Добавить подряд 5 элементов.
//        б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//        в) Записать в новый список все элементы предыдущего списка.
//
//        2. Получить элемент по индексу:
//        а). Получить первый элемент (первую книгу в списке)
//        б). Получить последний элемент (последнюю книгу в списке)
//
//        3. Задачи на удаление элементов: (Используя методы)
//        а) Удалить элемент по значению (книге)
//        б) Удалить элемент по индексу
//
//        4. Проверить наличие элемента
//
//        5. Вывод списка:
//        а) Вывести список на экран в формате: List: [ Book{"7 навыков высокоэффективных людей", "Кови", 387};
//        Book{"Java. Эффективное программирование", "Блох Дж.", 219};]

package ru.itsjava.homeWork.collections.lists.homeWork14;

import java.util.ArrayList;
import java.util.List;

public class HomeWork14 {
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
        // Из них используем только 7
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
                System.out.print(bookList.get(i)+";");
            } else {
                System.out.println(bookList.get(i) + ";");
            }
        }
        System.out.println("]");


    }
}
