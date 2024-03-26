package ru.itsjava.experiments.clonable;

import lombok.Data;

// Contains a reference of Test and implements
// clone with deep copy.
@Data
class Test2 implements Cloneable {
    int a, b;

    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        // Assign the shallow copy to new reference variable
        // t
        Test2 t = (Test2) super.clone();

        // Block below is a DEEP CLONING process. Without it changes in parent object would be reflected in child.
        {
            int tempX = t.c.x; // Временно сохраняем поля оригинального объекта.
            int tempY = t.c.y;

            t.c = new Test(); // Присваиваем новый объект в heap
            t.c.x = tempX; // Копируем в него необходимые поля
            t.c.y = tempY;
        }
        return t;
    }
}