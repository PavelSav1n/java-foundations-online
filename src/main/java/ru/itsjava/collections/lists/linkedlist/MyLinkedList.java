package ru.itsjava.collections.lists.linkedlist;

public class MyLinkedList {

    private Node head;

    public int size() {
        // Если список не пуст, смотрим элементы:
        if (head != null) {
            // Если начальный узел ссылается на null, значит в списке всего один элемент
            if (head.getNext() == null) {
                return 1;
            } else {
                // Если нет, идём к следующему элементу
                // Создаём указатель (текущее положение -- начальный узел) и создаём счётчик:
                Node curNode = head;
                int nodeCount;
                // Идём по списку до тех пор, пока текущий узел не будет указывать на null и увеличиваем счётчик
                // Можно через while или for:
//                while (curNode.getNext() != null) {
//                    curNode = curNode.getNext();
//                    nodeCount++;
//                }
                for (nodeCount = 1; curNode.getNext() != null; nodeCount++) {
                    curNode = curNode.getNext();
                }
                return nodeCount;
            }
        }
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        if (head != null) {
            // Проверяем начальный узел:
            if (head.getValue().equals(o)) {
                return true;
            } else {
                // Проверяем все остальные узлы. Создаём указатель и бежим по ссылкам:
                Node curNode = head;
                while (curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    if (curNode.getValue() != null && curNode.getValue().equals(o)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean add(Object o) {
        // Создаём новый узел на основе входящего объекта:
        Node resNode = new Node(o, null);
        // Если это первый элемент, то пишем сюда:
        if (head == null) {
            head = resNode;
        } else {
            // Иначе идём в конец:
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            // Записываем ссылку на этот узел в текущем элементе:
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    // Варианты:
    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    public Object remove(int index) {
        // Проверяем входящий индекс. Должен быть в рамках size() нашего односвязного списка
        // Тут же мы убеждаемся, что список не пустой (внутри вызывается size() где происходит проверка head != null)
        checkIndex(index);
        // Если мы запрашиваем удаление первого элемента списка:
        if (index == 0) {
            // Создаём переменную, где будем хранить удаляемые данные (объект Node.value) из нашего узла
            Object resValue = head.getValue();
            // Если это конец нашего списка (то есть первый элемент -- он же и конечный)
            if (head.getNext() == null) {
                // То обнуляем начальный узел списка.
                head = null;
            } else {
                // Если список имеет продолжение, то перемещаем начальный узел на один узел вправо:
                head = head.getNext();
            }
            // Возвращаем сохранённые данные из удаляемого узла:
            return resValue;
        }
        // Если index у нас > 0, то нам потребуется где-то хранить указатели на текущий и предыдущий узел. Создаём их:
        // Переменная для текущего узла (по умолчанию указывает на начальный узел списка):
        Node curNode = head;
        // Переменная для предыдущего узла (по умолчанию так же указывает на начальный узел списка)
        Node prevNode = head;
        // Так же потребуется счётчик узлов, который мы будем сравнивать с входящим индексом
        int count = 0;
        // Необходимо пробежаться в цикле до нужного нам индекса
        // В первой же итерации мы перемещаем указатель текущего узла на один шаг вправо
        // Но: сначала выполняется оператор сравнения, и после этого присвоение, поэтому один раз как минимум мы зайдём в цикл ...
        // ... поскольку в данный момент текущий элемент равен начальному узлу и мы находимся здесь, потому что в списке явно больше одного элемента
        while ((curNode = curNode.getNext()) != null) {
            // После захода в цикл текущий указатель сместился на один узел вправо
            // Увеличиваем счётчик на один
            count++;
            // Если счётчик сравнялся с искомым индексом, выходим из цикла.
            if (count == index) {
                // На момент выхода из цикла у нас есть указатели на текущий узел и на предыдущий в переменных curNode и prevNode
                break;
            }
            // Если ещё нет, то перемещаем указатель на предыдущий узел в текущий.
            prevNode = prevNode.getNext();
        }
        // Как только мы получили искомую пару, можно создать переменную, в которой будем хранить данные из удаляемого узла:
        Object resValue = curNode.getValue();

        // Если текущий узел является концом списка
        if (curNode.getNext() == null) {
            // то необходимо просто сделать конечным узлом предыдущий:
            prevNode.setNext(null);
        } else {
            // Если текущий узел находится где-то посередине, то меняем указатель предыдущего узла, чтобы он указывал на следующий за текущим(удаляемым) узлом.
            prevNode.setNext(curNode.getNext());
            // ссылку текущего удаляемого узла обnullяем
            curNode.setNext(null);
        }
        // Возвращаем данные удаляемого узла
        return resValue;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }

    // CTRL + ALT + M -- refactor selected code
    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < size())) {
            return true;
        }
        return false;
    }
}
