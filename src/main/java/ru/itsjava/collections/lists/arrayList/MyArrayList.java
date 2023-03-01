package ru.itsjava.collections.lists.arrayList;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        // realSize у нас инкрементируется только при добавлении нового объекта в массив.
        return realSize == 0;
    }

    public boolean contains(Object o) {
        if (realSize > 0) {
            for (int i = 0; i < realSize; i++) {
                if (array[i].equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean add(Object o) {
        if (realSize == array.length) {
            // Создаём новый массив с новой длинной
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            // Копирование массива -- ниже поменяли на System.arraycopy()
//            for (int i = 0; i < array.length; i++) {
//                resArray[i] = array[i];
//            }
            System.arraycopy(array, 0, resArray, 0, array.length);
            // присваиваем старой ссылке на старый массив ссылку на новый массив
            array = resArray;
        }
        // Вставка входящего эелемента
        // ++ будет работать после выполнения array[realSize] = o;
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");

        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
