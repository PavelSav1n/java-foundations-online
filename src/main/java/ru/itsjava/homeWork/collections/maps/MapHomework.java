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
        Fruit melon = new Fruit("Арбуз", 3000.0);


        Map<String, Fruit> purchases = new HashMap<>();

        // 1.a --  Добавляем покупки с фруктами в нашу карту:
        purchases.put("Ivanov", apple);
        purchases.put("Petrov", pineapple);
        purchases.put("Sidorov", orange);
        purchases.put("Ivanova", peach);
        purchases.put("Boba", banana);
        purchases.put("Vova", melon);
        purchases.put("Vitya", melon);
        purchases.put("Kristina", melon);

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

        // б) Вывести все значения (все фрукты)
        System.out.println("purchases.values() = " + purchases.values());

        // в) Вывести все ключи и значения с помощью entrySet (всех покупателей и фрукты)
        System.out.println("purchases.entrySet() = " + purchases.entrySet());
        System.out.println();

        // 6. Отфильтровать Map вернуть записи по некоторому условию:
        // а) Условие на ключ: вернуть количество ключей, длина которых больше 5 (покупателей, чье имя больше 5)
        System.out.println(" -------------------------------------------- ");
        purchases.put("Ivanov", apple); // добавим удалённого Иванова
        purchases.put("Lena", apple); // добавим ещё одного любителя яблок
        int count = 0;
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getKey().length() > 5) {
                count++;
            }
        }
        System.out.println("Итого " + count + " покупателей, длина имени которых больше 5");
        System.out.println();
        // б) Условие на значение: Вернуть количество элементов, которые равны "***" (фруктов, которые равны яблоку)
        count = 0;
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getValue() == apple) {
                count++;
            }
        }
        System.out.println(count + " покупателей приобрели яблоки");

        System.out.println();
        //7. Пропустить несколько элементов
        //а) Пропустить 2 элемента, значения которых Арбуз, все остальные вывести.
        int melonCount = 0;
        System.out.println("purchases.size() = " + purchases.size());
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getValue() == melon) {
                melonCount++;
                if (melonCount > 2) {
                    System.out.println(pair.getKey() + ": " + pair.getValue());
                }
            } else {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }
        System.out.println();
        // б) Вывести все кроме 2 элементов, ключи которых начинаются на I (у меня нет "А")
        System.out.println("purchases.size() = " + purchases.size());
        count = 0;
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getKey().startsWith("I")) {
                if (count >= 2) {
                    System.out.println(pair.getKey() + ": " + pair.getValue());
                }
                count++;
            } else {
                System.out.println(pair.getKey() + ": " + pair.getValue());
            }
        }
        System.out.println();
        //8. Вернуть первый подходящий элемент:
        //а) Возвращаем элемент значение которого арбуз или Арбуз или АРбУз.
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("АРбУз")) {
                System.out.println(pair.getKey() + ": " + pair.getValue());
                break;
            }
        }
        System.out.println();
        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все элементы в другую карту, которые являются яблоком или арбузом
        // Очищаем новую карту:
        newPurchases.clear();
        // Копируем подходящие элементы в новую карту:
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            if (pair.getValue().getName().equalsIgnoreCase("АРбУз") || pair.getValue().getName().equalsIgnoreCase("яблоко")) {
                newPurchases.put(pair.getKey(), pair.getValue());
            }
        }
        System.out.println("newPurchases = " + newPurchases);

        System.out.println();
        // 10. Найти средний вес всех фруктов.
        double totalWeight = 0;
        count = 0;
        for (Map.Entry<String, Fruit> pair : purchases.entrySet()) {
            totalWeight = totalWeight + pair.getValue().getWeight();
            count++;
        }
        System.out.println("Средний вес всех всех " + count + " фруктов: " + Math.round(totalWeight / count) + " грамм");


    }
}
