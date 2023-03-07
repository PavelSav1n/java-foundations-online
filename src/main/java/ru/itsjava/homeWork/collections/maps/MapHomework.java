package ru.itsjava.homeWork.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapHomework {
    public static void main(String[] args) {
        // Создали класс Fruit с полями наименование и вес:
        Fruit apple = new Fruit("Яблоко", 50.0);
        Fruit pineapple = new Fruit("Ананас", 200.0);
        Fruit orange = new Fruit("Апельсин", 55.0);
        Fruit peach = new Fruit("Персик", 40.0);
        Fruit banana = new Fruit("banana", 60.0);

        Map<String, Fruit> purchases = new HashMap<>();

        // 1.a --  Добавляем покупки с фруктами в нашу карту:
        purchases.put("Ivanov", apple);
        purchases.put("Petrov", pineapple);
        purchases.put("Sidorov", orange);
        purchases.put("Ivanova", peach);
        purchases.put("Petrova", banana);

        System.out.println("purchases = " + purchases);

        // 1.б -- Создаём новый экземпляр HashMap и копируем в неё предыдущую карту
        Map<String, Fruit> newPurchases = new HashMap<>();
        newPurchases.putAll(purchases);
        System.out.println("newPurchases = " + newPurchases);

        // 2 -- Получаем элемент по ключу:
        System.out.println("purchases.get(\"Ivanov\") = " + purchases.get("Ivanov"));

        // 3 -- Удаляем фрукт (покупку):
        System.out.println("purchases.remove(\"Ivanov\") = " + purchases.remove("Ivanov"));

        // 4. Проверка на наличие ключ и значение (Есть ли покупатель с таким фруктом)
        System.out.println("purchases.containsKey(\"Ivanov\") = " + purchases.containsKey("Ivanov"));
        System.out.println("purchases.containsValue(orange) = " + purchases.containsValue(orange));

        // 5. Вывод Map на экран:
        // a) Вывести все ключи (всех покупателей)
        System.out.println("purchases.keySet() = " + purchases.keySet());

        //б) Вывести все значения (все фрукты)
        System.out.println("purchases.values() = " + purchases.values());

        //в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        System.out.println("purchases.entrySet() = " + purchases.entrySet());
        System.out.println();
        System.out.println("Более красивый вид:");
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            System.out.println(pair.getKey() + ": " + pair.getValue());
        }


    }
}
