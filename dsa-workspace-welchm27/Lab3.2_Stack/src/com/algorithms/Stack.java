package com.algorithms;


import java.util.LinkedList;

public class Stack<V> {

    private LinkedListNode<V> head;

    public Stack(){
        head = null;
    }

    public void push(V item) {
        // TODO Lab 3.2.a: Create pseudocode for operation.
        // create a newNode for the item
//        LinkedListNode<V> newNode = new LinkedListNode<>(item, null);
//
//        if(head != null){
//            newNode.setNext(head);
//        }
//        head = newNode;

        // TODO Lab 3.2.b: Implement based on pseudocode.
        // 2nd form of implementation
        if(item != null){
            LinkedListNode<V> newNode = new LinkedListNode<>(item, head);
            head = newNode;
        }
    }

    public V pop() {
        // TODO Lab 3.2.a: Create pseudocode for operation.
        /*
        1. if head != null
                node = head
                head = node.next
                return node.value
            else
                return null
         */
        // TODO Lab 3.2.b: Implement based on pseudocode.
        if(head != null){
            V value = head.getValue();
            head = head.getNext();
            return value;
        }
        return null;
    }
}
