package ru.itsjava.collections.iterators;

import ru.itsjava.collections.maps.Man;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorPractice {
    public static void main(String[] args) {

        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        // Добавление в hashMap через метод put()
        men.put(ivanov, "футболка");
        men.put(sidorov, "Свитшот");
        men.put(javov, "Свитер");

//        CTRL + ALT + V
        Iterator<Map.Entry<Man, String>> iterator = men.entrySet().iterator();

        System.out.println("iterator = " + iterator);
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        // next() возвращает объект, на который в данный момент указывает итератор и передвигает указатель на следующий нашего entrySet()
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());
        System.out.println("iterator.next() = " + iterator.next());
        System.out.println("iterator.hasNext() = " + iterator.hasNext());

        // то что скрывает итератор foreach:
        while (iterator.hasNext()) {
            Map.Entry<Man, String> pair = iterator.next();
            System.out.println(pair.getKey() + ": " + pair.getValue());

        }
    }
}
