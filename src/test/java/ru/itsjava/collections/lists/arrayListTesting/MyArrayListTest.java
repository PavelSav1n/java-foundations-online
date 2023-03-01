package ru.itsjava.collections.lists.arrayListTesting;

import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.arrayList.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    public static final String DEFAULT_OBJECT = "TestObject";
    public static final String TEST_OBJECT = "TestObject";
    public static final String WRONG_OBJECT = "WrongObject";

    @Test
    public void shouldHaveCorrectIsEmptyMethod(){
        MyArrayList list = new MyArrayList();

        // Пустой список, пока ничего не добавили
        assertTrue(list.isEmpty());
        list.add(DEFAULT_OBJECT);
        // Добавили элемент -- теперь не пустой
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldHaveCorrectContainsMethod(){
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
    public void shouldHaveCorrectClearMethod(){
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

}
