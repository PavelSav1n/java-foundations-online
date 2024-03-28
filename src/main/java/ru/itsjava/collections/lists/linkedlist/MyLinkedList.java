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
        // Если начальный узел не инициализирован, значит список пустой, возвращаем false
        if (head == null) return false;
        // Если список не пуст, проверяем начальный узел по значению.
        if (head.getValue().equals(o)) {
            // Если совпадает, перемещаем указатель начального узла на следующий элемент
            // (при этом содержимое удаляемого элемента не затирается, т.к. двигается лишь указатель списка)
            head = head.getNext();
            // Возвращаем true об успешном удалении
            return true;
        }
        // Если объект первого элемент не равен искомому объекту и это конец списка, возвращаем false
        if (head.getNext() == null) return false;
        // Если список имеет продолжение, создаём указатели на текущий и предыдущий узел:
        Node curNode = head;
        Node prevNode = head;
        // Ищем по списку узел, содержащий объект, равный искомому до конца списка:
        while ((curNode = curNode.getNext()) != null) {
            if (curNode.getValue().equals(o)) {
                // Если нашли, то имеем пару curNode и prevNode, указывающие на текущий узел с удаляемыми данными и предыдущий
                break;
            }
            // Перемещаем указатель предыдущего нода после break, чтобы иметь пару указывающие не на один и тот же узел
            prevNode = prevNode.getNext();
        }
        // Проверка, на случай, если мы дошли до конца списка и не нашли удаляемый объект.
        // В этом случае curNode и prevNode будут указывать на null. Возвращаем false.
        if (curNode == null) return false;
        // Если удаляемый объект найден, переназначаем ссылку предыдущего узла на узел, стоящий после текущего
        prevNode.setNext(curNode.getNext());
        // Обnullяем ссылку текущего узла.
        curNode.setNext(null);
        // Репортим успех:
        return true;
    }

    // Варианты:
    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    public void clear() {
        // Проверяем, есть ли список
        if (head != null) {
            // Если список не пустой, затираем значение начального узла
            head.setValue(null);
            // Если это не конец списка
            if (head.getNext() != null) {
                // Создаём указатель на текущий узел:
                Node curNode = head;
                Node prevNode = head;
                // Пока это не конечный узел, идём по узлам
                while (curNode.getNext() != null) {
                    // Перемещаем указатель на следующий узел:
                    curNode = curNode.getNext();
                    // Затираем данные узла:
                    curNode.setValue(null);
                    // Затираем ссылку на этот узел в предыдущем:
                    prevNode.setNext(null);
                    // TODO: ТУТ БЫЛА ОШИБКА. Нужно двигать prevNode, чтобы обнулять ссылки.
                    prevNode = curNode;
                }
            }
            // Конец списка. Обnullяем список:
            head = null;
        }
    }


    public Object get(int index) {
        // Проверяем индекс и на непустой список:
        checkIndex(index);
        // Cоздаём указатель и счётчик узлов
        Node curNode = head;
        int nodeCount;
        // Идём по списку до тех пор, пока счётчик узлов не сравняется с индексом
        for (nodeCount = 0; nodeCount != index; nodeCount++) {
            curNode = curNode.getNext();
        }
        return curNode.getValue();
    }

    // Варианты:
    // СТРОКА1 -> null
    // СТРОКА1 -> СТРОКА2 -> null
    // СТРОКА1 -> СТРОКА2 -> СТРОКА3 -> null
    public Object set(int index, Object element) {
        // Проверяем индекс и на непустой список:
        checkIndex(index);
        // Cоздаём указатель и счётчик узлов
        Node curNode = head;
        int nodeCount;
        // Идём по списку до тех пор, пока счётчик узлов не сравняется с индексом
        for (nodeCount = 0; nodeCount != index; nodeCount++) {
            curNode = curNode.getNext();
        }
        // Как только нашли элемент по индексу, создаём переменную, где будем хранить удаляемый элемент для возврата
        Object deletedElement = curNode.getValue();
        // Вставляем новый элемент
        curNode.setValue(element);
        return deletedElement;

    }

    public void add(int index, Object element) {
        // Проверяем входящий индекс. Должен быть в рамках size() нашего односвязного списка
        // Тут же мы убеждаемся, что список не пустой (внутри вызывается size() где происходит проверка head != null)
        checkIndex(index);
        // Если вставляем на место первого элемента
        if (index == 0) {
            head = new Node(element, head);
        } else {
            // Если в списке больше одного элемента, создаём указатели и счётчик
            Node curNode = head;
            Node prevNode = head;
            int nodeCount = 0;
            // Бежим до конца списка
            while ((curNode = curNode.getNext()) != null) {
                nodeCount++;
                // до тех пор, пока счётчик не сравняется с искомым индексом
                if (nodeCount == index) {
                    break;
                }
                prevNode = prevNode.getNext();
            }
            // Создаём новый узел, указывающий на текущий
            Node newNode = new Node(element, curNode);
            // Предыдущему меняем указатель на новый узел
            prevNode.setNext(newNode);
        }
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
        // Проверка, на случай, если мы дошли до конца списка и не нашли удаляемый объект.
        // В этом случае curNode и prevNode будут указывать на null. Возвращаем null, чтобы избежать NullPointerException в curNode.getValue();
        if (curNode == null) return null;

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
        // Если список пуст, то возвращаем провал операции:
        if (head == null) return -1;
        // Если искомый объект находится в первом узле
        if (head.getValue().equals(o)) {
            // Если значения совпали, возвращаем индекс 0
            return 0;
        }
        // Если дальше, создаём указатель:
        Node curNode = head;
        // Создаём счётчик индекса
        int nodeIndex = 0;
        // Идём до конца списка
        while ((curNode = curNode.getNext()) != null) {
            // каждый цикл увеличиваем индекс на 1
            nodeIndex++;
            // Если нашли в узле искомый объект, выходим из цикла
            if (curNode.getValue().equals(o)) {
                break;
            }
        }
        // Если дошли до конца и не нашли искомый объект, возвращаем провал:
        if (curNode == null) return -1;

        // Если нашли, возвращаем индекс:
        return nodeIndex;
    }

    public int lastIndexOf(Object o) {
        // Если список пуст, то возвращаем провал операции:
        if (head == null) return -1;
        // Создаём счётчик индекса
        int nodeIndex = 0;
        // Создаём переменную, в которой будем хранить индекс последнего совпавшего узла:
        int lastNodeIndex = -1;
        // Проверяем, совпадает ли с искомым объектом содержимое начального узла
        if (head.getValue().equals(o)) {
            // Если значения совпали, присваиваем переменной последнего индекса текущий индекс
            lastNodeIndex = nodeIndex;
        }
        // Проверяем, есть ли у списка продолжение:
        if (head.getNext() != null) {
            // Создаём указатель:
            Node curNode = head;
            // Идём до конца списка
            while ((curNode = curNode.getNext()) != null) {
                // каждый цикл увеличиваем индекс на 1
                nodeIndex++;
                // Если нашли в узле искомый объект, присваиваем переменной последнего индекса текущий индекс
                if (curNode.getValue().equals(o)) {
                    lastNodeIndex = nodeIndex;
                }
            }
        }
        // Если совпадений не нашли, то lastNodeIndex равен -1
        // Если нашли, то он соответствует соответствующему индексу
        return lastNodeIndex;
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

    // Тут проверяется так же на непустой список, потому что используется метод size(), где чекаем head != null
    private boolean isCorrectIndex(int index) {
        return (index > -1) && (index < size());
    }
}
