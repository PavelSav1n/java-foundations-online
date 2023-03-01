package ru.itsjava.collections.lists.arrayListTesting;

import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arrayList.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    public static final String DEFAULT_OBJECT = "TestObject";
    public static final String TEST_OBJECT = "TestObject";
    public static final String WRONG_OBJECT = "WrongObject";

    @Test
    public void shouldHaveCorrectIsEmptyMethod() {
        MyArrayList list = new MyArrayList();

        // Пустой список, пока ничего не добавили
        assertTrue(list.isEmpty());
        list.add(DEFAULT_OBJECT);
        // Добавили элемент -- теперь не пустой
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldHaveCorrectContainsMethod() {
        MyArrayList list = new MyArrayList();

        // Пустой список, пока ничего не добавили должно быть false:
        assertFalse((list.contains(TEST_OBJECT)));
        list.add(DEFAULT_OBJECT);
        // Добавили элемент, сравниваем с таким же тестовым объектом
        assertTrue(list.contains(TEST_OBJECT));
        // Сравниваем на наличие другого объекта:
        assertFalse(list.contains(WRONG_OBJECT));
        // Добавляем другой объект, сравниваем наличие:
        list.add(WRONG_OBJECT);
        assertTrue(list.contains(WRONG_OBJECT));
    }

    @Test
    // public void clear()
    public void shouldHaveCorrectClearMethod() {
        MyArrayList list = new MyArrayList();

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
    }

    @Test
    // public int indexOf(Object o)
    // Возвращает индекс входящего объекта, если есть. Если нет возвращает -1
    public void shouldHaveCorrectIndexOfMethod() {
        // Создаём и наполняем тестовые списки:
        MyArrayList list = new MyArrayList();
        MyArrayList listEmpty = new MyArrayList();
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
        MyArrayList list = new MyArrayList();
        MyArrayList listEmpty = new MyArrayList();
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
        MyArrayList list = new MyArrayList();
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
        MyArrayList list = new MyArrayList();
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
        MyArrayList list = new MyArrayList();
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
    }
}
