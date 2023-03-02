package ru.itsjava.collections.lists.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Node {
    private Object value;
    private Node next;
}
