package ru.itsjava.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {

        Map<Man, String> men = new HashMap<>();
        Man ivanov = new Man("Иванов");
        Man sidorov = new Man("Сидоров");
        Man javov = new Man("Джавов");

        // Добавление в hashMap через метод put()
        men.put(ivanov,"футболка");
        men.put(sidorov,"Свитшот");
        men.put(javov, "Свитер");

        // Это String:
        System.out.println("men = " + men);
        // А это множество пар:
        System.out.println("men.entrySet() = " + men.entrySet());


        System.out.println(" -------пробежаться по хэшмапе с помощью только ключей --------- ");
        // foreach     тип      переменн | множество пар в виде сета
        for (Map.Entry<Man, String> pair: men.entrySet()){
            System.out.println(pair.getKey() + ": "+ pair.getValue());
        }

        // Это множество ключей:
        System.out.println("men.keySet() = " + men.keySet());

        System.out.println(" -------пробежаться по хэшмапе с помощью только ключей --------- ");
        // foreach
        for (Man keyMan : men.keySet()){    // получить по ключу значение ключа

            System.out.println(keyMan+ ": " + men.get(keyMan));
        }

        System.out.println(" ------- deleting ivanov --------- ");
        System.out.println("men.remove(ivanov) = " + men.remove(ivanov));
        System.out.println(" ------- after delete ivanov --------- ");
        // foreach
        for (Man keyMan : men.keySet()){    // получить по ключу значение ключа
            System.out.println(keyMan+ ": " + men.get(keyMan));
        }

        System.out.println("men.size() = " + men.size());
        System.out.println("men.isEmpty() = " + men.isEmpty());

        System.out.println("men.replace(javov, \"Свитер\", \"перчатки\") = " + men.replace(javov, "Свитер", "перчатки"));
        System.out.println(" ------- after replacing javov value  --------- ");
        System.out.println("men.get(javov) = " + men.get(javov));

        men.clear();
        System.out.println("men.size() = " + men.size());
    }
}
