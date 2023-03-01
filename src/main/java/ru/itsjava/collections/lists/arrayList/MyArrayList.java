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
                if (array[i] != null && array[i].equals(o)) {
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
        int delIndex = -1;
        // Сначала ищем индекс нашего удаляемого объекта:
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        // Затем смещаем данные на 1 индекс влево:
        // рефакторим на System.arraycopy()
//        for (int i = delIndex; i < array.length - 1; i++) {
//            array[i] = array[i + 1];
//        }

        // Тут нужно было добавить проверку на delIndex > -1, иначе мы смещали массив влево вне зависимости от того, нашли мы объект в массиве или нет.
        if (delIndex > -1 && (array.length - 1 - delIndex >= 0)) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }


    public Object set(int index, Object element) {
        // Проверка, что индекс находится в рамках нашего массива
        checkIndex(index);
        Object oldElement = array[index];
        array[index] = element;
        // Возвращаем элемент, который заменили
        return oldElement;
    }

    public void add(int index, Object element) {
        // Проверка, что индекс находится в рамках нашего массива
        checkIndex(index);
        if (realSize == array.length) {
            // Создаём новый массив с новой длинной
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            // Копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            // присваиваем старой ссылке на старый массив ссылку на новый массив
            array = resArray;
        }
        // Смещаем массив вправо на 1 элемент
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        // Вставка входящего эелемента по индексу
        array[index] = element;
        realSize++;
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public Object remove(int index) {
        // CTRL + ALT + M -- refactor selected code
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    // CTRL + ALT + M -- refactor selected code
    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != null && array[i].equals(o))
                return i;
        }
        return -1;
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
