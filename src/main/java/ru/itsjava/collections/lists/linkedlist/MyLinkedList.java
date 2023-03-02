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
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
