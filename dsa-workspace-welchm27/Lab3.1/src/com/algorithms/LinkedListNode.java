package com.algorithms;

public class LinkedListNode<T> {

    // TODO Lab 3.1.B: Modify to use generics, instead of int.

    private T value; //data member of the node
    private LinkedListNode<T> next; // self-referential pointer

    public LinkedListNode(T value, LinkedListNode<T> next) {
        this.value = value;
        this.next = next;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public LinkedListNode setNext(LinkedListNode<T> next) {
        this.next = next;
        return this;
    }

    public T getValue() {
        return value;
    }

    public LinkedListNode setValue(T value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                '}';
    }

}
