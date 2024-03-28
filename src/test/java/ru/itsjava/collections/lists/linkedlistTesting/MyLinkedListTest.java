package ru.itsjava.collections.lists.linkedlistTesting;

import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.linkedlist.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {

    public static final String DEFAULT_OBJECT = "TestObject";
    public static final String TEST_OBJECT = "TestObject";
    public static final String OTHER_OBJECT = "OtherObject";
    public static final String WRONG_OBJECT = "WrongObject";

    @Test
    //public int size()
    public void shouldHaveCorrectSizeMethod() {
        MyLinkedList list = new MyLinkedList();
        // Пусто список, размер должен быть 0:
        assertEquals(0, list.size());
        // Добавляем элемент в список, размер должен стать 1
        list.add("Obj1");
        assertEquals(1, list.size());
        // Удаляем элемент, размер снова должен стать 0:
        list.remove(0);
        assertEquals(0, list.size());
    }

    @Test
    // public boolean isEmpty()
    public void shouldHaveCorrectIsEmptyMethod() {
        MyLinkedList list = new MyLinkedList();
        // Пустой список, пока ничего не добавили
        assertTrue(list.isEmpty());
        list.add(DEFAULT_OBJECT);
        // Добавили элемент -- теперь не пустой
        assertFalse(list.isEmpty());
    }

    @Test
    // public boolean contains(Object o)
    // Возвращает true, если список содержит искомый объект и false в ином случае
    public void shouldHaveCorrectContainsMethod() {
        MyLinkedList list = new MyLinkedList();
        // Пустой список, пока ничего не добавили должно быть false:
        assertFalse((list.contains(TEST_OBJECT)));
        list.add(DEFAULT_OBJECT);
        // Добавили элемент, сравниваем с таким же тестовым объектом
        assertTrue(list.contains(TEST_OBJECT));
        // Сравниваем на наличие другого объекта:
        assertFalse(list.contains(OTHER_OBJECT));
        // Добавляем другой объект, сравниваем наличие:
        list.add(OTHER_OBJECT);
        assertTrue(list.contains(OTHER_OBJECT));
    }

    @Test
    // public boolean add(Object o)
    // Добавляет указанный объект в конец списка
    // Возвращает true, если успешно добавили
    public void shouldHaveCorrectAddMethod() {
        MyLinkedList list = new MyLinkedList();
        // Пустой список -- не содержит элементов
        assertEquals(0, list.size());
        // Добавляем объект в список, проверяем успешно ли добавился:
        assertTrue(list.add(TEST_OBJECT));
        // Длина списка увеличилась на 1:
        assertEquals(1, list.size());
        // Проверяем, находится ли именно наш объект в списке:
        assertEquals(TEST_OBJECT, list.get(0));
        // Добавляем ещё один объект, проверяем, добавился ли он в конец списка:
        assertTrue(list.add(OTHER_OBJECT));
        assertEquals(2, list.size());
        assertEquals(OTHER_OBJECT, list.get(1));
    }

    @Test
    // public boolean remove(Object o)
    // Метод удаляет указанный объект и возвращает true, если нашли и удалили
    // false, если указанный объект не найден
    public void shouldHaveCorrectRemoveMethod() {
        // Создаём и наполняем тестовый список:
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        // Список выглядит как набор из десяти объектов Obj1, Obj2, ... Obj10:
        System.out.println("list before remove() test = " + list);
        // Список из 10 элементов
        assertEquals(10, list.size());
        // Удаляем начальный элемент.
        assertTrue(list.remove("Obj1"));
        // Должно стать 9 элементов:
        assertEquals(9, list.size());
        // Удалённого элемента нет:
        assertFalse(list.contains("Obj1"));
        // Удаляем элемент в середине:
        assertTrue(list.remove("Obj5"));
        // Должно стать 8 элементов:
        assertEquals(8, list.size());
        // Удалённого элемента нет:
        assertFalse(list.contains("Obj5"));
        // Удаляем элемент в конце:
        assertTrue(list.remove("Obj10"));
        // Должно стать 7 элементов:
        assertEquals(7, list.size());
        // Удалённого элемента нет:
        assertFalse(list.contains("Obj10"));
        // Удаляем несуществующий элемент:
        assertFalse(list.remove(WRONG_OBJECT));
        System.out.println("list after remove() test = " + list);
    }

    @Test
    // public void clear()
    public void shouldHaveCorrectClearMethod() {
        MyLinkedList list = new MyLinkedList();
        // Пустой список. Пока true:
        assertTrue(list.isEmpty());
        // Очищаем пустой список. Должно быть true:
        list.clear();
        assertTrue(list.isEmpty());
        // Добавили элемент. Теперь не пустой:
        list.add(DEFAULT_OBJECT);
        assertFalse(list.isEmpty());
        // Очищаем, проверяем:
        list.clear();
        assertTrue(list.isEmpty());
        // Checking several nodes:
        list.add(DEFAULT_OBJECT);
        list.add(DEFAULT_OBJECT);
        list.add(DEFAULT_OBJECT);
        list.add(DEFAULT_OBJECT);
        System.out.println("list.size() = " + list.size());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    // public int indexOf(Object o)
    // Возвращает индекс входящего объекта, если есть. Если нет возвращает -1
    public void shouldHaveCorrectIndexOfMethod() {
        // Создаём и наполняем тестовые списки:
        MyLinkedList list = new MyLinkedList();
        // Обнаружил, что тесты связного списка могут работать на списках с записями более двух, но меньше могут выдавать ошибки.
        // Поэтому пишу проверки на списки из двух и менее элементов:
        list.add(DEFAULT_OBJECT); // добавляем элемент
        assertEquals(0, list.indexOf(TEST_OBJECT)); // должен быть 0 индексом
        list.add(OTHER_OBJECT); // заменим 2 элемент на другой
        assertEquals(0, list.indexOf(TEST_OBJECT)); // должен остаться 0 индексом
        assertEquals(1, list.indexOf(OTHER_OBJECT)); // должен быть 1 индексом
        list.clear(); // продолжим стандартные проверки
        MyLinkedList listEmpty = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        // Список выглядит как набор из десяти объектов Obj1, Obj2, ... Obj10:
        System.out.println("list = " + list);
        //Проверяем первый объект
        assertEquals(0, list.indexOf("Obj1"));
        // Проверяем середину
        assertEquals(4, list.indexOf("Obj5"));
        // Проверяем конец
        assertEquals(9, list.indexOf("Obj10"));
        // Проверяем несуществующий элемент
        assertEquals(-1, list.indexOf(TEST_OBJECT));
        // Проверяем пустой список
        assertEquals(-1, listEmpty.indexOf(TEST_OBJECT));
    }

    @Test
    // public int lastIndexOf(Object o)
    // Возвращает индекс последнего объекта совпадающего с входящим. Если нет совпадений, возвращает -1
    public void shouldHaveCorrectLastIndexOfMethod() {
        // Создаём и наполняем тестовые списки:
        MyLinkedList list = new MyLinkedList();
        // Обнаружил, что тесты связного списка могут работать на списках с записями более двух, но меньше могут выдавать ошибки.
        // Поэтому пишу проверки на списки из двух и менее элементов:
        list.add(DEFAULT_OBJECT); // добавляем элемент
        assertEquals(0, list.lastIndexOf(TEST_OBJECT)); // должен быть 0 индексом
        list.add(DEFAULT_OBJECT); // ещё такой же
        assertEquals(1, list.lastIndexOf(TEST_OBJECT)); // должен быть 1 индексом
        list.remove(1);
        list.add(OTHER_OBJECT); // заменим 2 элемент на другой
        assertEquals(0, list.lastIndexOf(TEST_OBJECT)); // должен быть 0 индексом
        list.clear(); // продолжим стандартные проверки
        MyLinkedList listEmpty = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        // Добавляем парочку повторяющихся объектов в конец:
        list.add("Obj1");
        list.add("Obj4");
        // Список выглядит как набор из 12 объектов Obj1, Obj2, ... Obj10, Obj1, Obj4:
        System.out.println("list = " + list);
        //Проверяем первый объект
        assertEquals(10, list.lastIndexOf("Obj1"));
        // Проверяем середину
        assertEquals(9, list.lastIndexOf("Obj10"));
        // Проверяем конец
        assertEquals(11, list.lastIndexOf("Obj4"));
        // Проверяем несуществующий элемент
        assertEquals(-1, list.lastIndexOf(TEST_OBJECT));
        // Проверяем пустой список
        assertEquals(-1, listEmpty.lastIndexOf(TEST_OBJECT));
    }

    @Test
    // public void add(int index, Object element)
    // Добавить объект в список по указанному индексу
    public void shouldHaveCorrectAddIntObjMethod() {
        // Создаём и наполняем тестовые списки:
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        System.out.println("list = " + list);
        // Базовый список. Состоит из 10 элементов
        assertEquals(10, list.size());
        // Добавляем тестовый объект по индексу 0
        list.add(0, TEST_OBJECT);
        // Список должен увеличиться на 1 элемент
        assertEquals(11, list.size());
        // В списке должен быть добавленный объект
        assertTrue(list.contains(TEST_OBJECT));
        // В списке добавленный объект должен находиться по индексу 0
        assertEquals(0, list.indexOf(TEST_OBJECT));
        // Остальной массив должен сохранить свой порядок
        assertEquals(10, list.indexOf("Obj10"));
        System.out.println("list = " + list);
        // Вставляем объект в конец списка:
        list.add(list.size() - 1, WRONG_OBJECT);
        // Список должен увеличиться на 1 элемент
        assertEquals(12, list.size());
        // В списке наш WRONG_OBJECT должен находиться на предпоследнем месте:
        assertEquals(list.size() - 2, list.indexOf(WRONG_OBJECT));
        // Остальной массив должен сохранить свой порядок
        assertEquals(11, list.indexOf("Obj10"));
        System.out.println("list = " + list);
    }

    @Test
    // public Object set(int index, Object element)
    // Метод перезаписывает объект списка по индексу и возвращает старый объект, который перезаписали
    public void shouldHaveCorrectSetMethod() {
        // Создаём и наполняем тестовые списки:
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        // Список выглядит как набор из десяти объектов Obj1, Obj2, ... Obj10:
        System.out.println("list = " + list);
        // Перезаписываем первый объект. Длина списка не меняется:
        assertEquals("Obj1", list.set(0, TEST_OBJECT));
        assertEquals(10, list.size());
        // Перезаписываем середину
        assertEquals("Obj5", list.set(4, TEST_OBJECT));
        assertEquals(10, list.size());
        // Перезаписываем конец
        assertEquals("Obj10", list.set(9, TEST_OBJECT));
        assertEquals(10, list.size());
        System.out.println("list = " + list);
        // Перезаписываем несуществующий индекс. Будет ошибка ArrayIndexOutOfBoundsException
        // list.set(11, TEST_OBJECT);
    }

    @Test
    // public Object get(int index)
    // Метод возвращает объект списка по указанному индексу.
    public void shouldHaveCorrectGetMethod() {
        // Создаём и наполняем тестовые списки:
        MyLinkedList list = new MyLinkedList();
        for (int i = 1; i < 11; i++) {
            list.add("Obj" + i);
        }
        // Список выглядит как набор из десяти объектов Obj1, Obj2, ... Obj10:
        System.out.println("list = " + list);
        //Проверяем первый объект
        assertEquals("Obj1", list.get(0));
        // Проверяем середину
        assertEquals("Obj5", list.get(4));
        // Проверяем конец
        assertEquals("Obj10", list.get(9));
        // Пытаемся получить несуществующий индекс. Будет ошибка ArrayIndexOutOfBoundsException
        // list.get(99);
        // Проверяем пустой список. Будет ошибка ArrayIndexOutOfBoundsException.
//        list.clear();
//        System.out.println("list.get(0) = " + list.get(0));

    }

//    @Test
//    public void shouldHaveCorrectToStringMethod() {
//        MyLinkedList list = new MyLinkedList();
//        list.add(TEST_OBJECT);
//        assertEquals("MyLinkedList{TestObject }", list.toString());
//        list.add(OTHER_OBJECT);
//        assertEquals("MyLinkedList{TestObject OtherObject }", list.toString());
//
//    }
}

