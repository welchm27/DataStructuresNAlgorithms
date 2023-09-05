package com.algorithms;

import org.w3c.dom.Node;

public class Queue<V> {

    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DblLinkedListNode<V> head;
    private DblLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("2 values added to queue");
        System.out.println("Now try to remove both values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());

    }

    public void enqueue(V item) {
        // add an item to the end of the queue
        // TODO Lab 3.2.a: Create pseudocode for operation.
        // 1. create a new node for the item, next and previous null
        DblLinkedListNode<V> newNode = new DblLinkedListNode<>(item, head, tail);
        // 2. if head is null
        if(head == null){
            // then point head and tail to newNode
            head = newNode;
            tail = newNode;
        // 3. else:
        }else{
            // set tail's next pointer to the new node
            tail.setNext(newNode);
            // set the new node's previous pointer to tail
            newNode.setPrevious(tail);
            // set tail to new node
            tail = newNode;
        }
        // TODO Lab 3.2.b: Implement based on pseudocode.
    }

    public V dequeue() {
        // get and remove an item from the queue
        // TODO Lab 3.2.a: Create pseudocode for operation.
        // 1. if head is null
        if(head == null)
            return null;  // return null
        // 2. else:
        // make a nodePtr and assign it head
        V nodePtr = head.getValue();
        if (head.getNext() == null){
            head = null;
            return nodePtr;
        }else{
            // move head to head.next
            // set head previous to null
            head = head.getNext();
            // return node.value
            return nodePtr;
        }
        // TODO Lab 3.2.b: Implement based on pseudocode.
    }

}
