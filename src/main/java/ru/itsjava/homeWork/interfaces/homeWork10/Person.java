package ru.itsjava.homeWork.interfaces.homeWork10;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private final int age;

    @Override
    public int compareTo(@NotNull Person otherPerson) {
        // Сравниваем по фамилии:
        if (this.surname.equals(otherPerson.surname)) {
            // Если фамилии равны, то по имени:
            if (this.name.equals(otherPerson.name)) {
                // Если имена равны, то сравниваем по возрасту
                return this.age - otherPerson.age;
            } else
                return -1; // Если имена не равны возвращаем -1 или 1, разницы нет, поскольку не указана логика сравнения имён
        } else return -1; // Если фамилии не равны, возвращаем -1 или 1
    }

    // Реализация через compareTo реализованном в String.java. Там идёт лексикографичное сравнение строк. Сначала по символам, затем по длине строки.
    // Например символ "А" compareTo() "B" вернёт -1, а "AA" compareTo() "A" вернёт 1.
    public int compareTo2(@NotNull Person otherPerson) {
        // Сравниваем по фамилии:
        int result = this.surname.compareTo(otherPerson.surname);
        if (result == 0){
            // Если фамилии равны, то по имени:
            result = this.surname.compareTo(otherPerson.surname);
            if (result == 0) {
                // Если имена равны, то сравниваем по возрасту
                return this.age - otherPerson.age;
            } else
                return result;
        }
        else return result;
    }

    @Override
    public Person clone() {
        try {
            Person clone = (Person) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
