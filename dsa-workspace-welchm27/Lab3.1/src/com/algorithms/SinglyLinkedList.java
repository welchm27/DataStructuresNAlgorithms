package com.algorithms;

import org.w3c.dom.Node;

public class SinglyLinkedList<T> {

    private LinkedListNode<T> head;

    public SinglyLinkedList(){
        head = null;
    }

    public void addFront(T item) {
        // TODO Lab 3.1.A: Implement with int.
        LinkedListNode<T> newNode = new LinkedListNode<T>(item, null);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;
        }
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    //TODO homework assignment
    public void addInPosition(T item, int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Index not reachable");
        }
        LinkedListNode<T> newNode = new LinkedListNode<T>(item, null);
        LinkedListNode<T> nodePtr = this.head;     // set nodePtr1 to index0
        // case1: The index is at the beginning
        if (index == 0) {
            addFront(item);
            // case3: The index is at the end/larger than the list
        } else if (index >= traverseList(false) - 1) {
            appendToList(item);
            // case2: The index is in the middle
        } else {
            for (int i = 1; i < index; i++) {
                // set nodePtr to index
                nodePtr = nodePtr.getNext();
            }
            newNode.setNext(nodePtr.getNext());
            nodePtr.setNext(newNode);
        }
    }

    public void appendToList(T item) {
        // TODO Lab 3.1.A: Implement with int.
        // create a new node
        LinkedListNode<T> newNode = new LinkedListNode<>(item, null);
        // assign nodePtr to head
        LinkedListNode<T> nodePtr = this.head;
        // check if it's empty
        if(nodePtr == null){
            this.head = newNode;
        }else{
            // go to the end of the list
            while(nodePtr.getNext() != null){
                nodePtr = nodePtr.getNext();
            }
            // append the value to the end of the list (new node)
            nodePtr.setNext(newNode);
        }
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public void deleteFront() {
        // TODO Lab 3.1.A: Implement with int.
        LinkedListNode<T> firstNode = this.head;
        // make sure list isn't empty
        if(firstNode != null){
            // set head.next to node
            LinkedListNode<T> node = head.getNext();
            // if the 2nd node is not null that means we have more than 1 item in the list
            if(node != null){
                // separate the connection from head to the list
                this.head.setNext(null);
                // change head to the node set to node variable
                this.head = node;
            // if it is equal to null (meaning only 1 item in the list)
            }else{
                this.head = null;
            }
        }

        // TODO Lab 3.1.B: Modify to use generics, instead of int.



    }

    public void reverse() {
        // TODO Lab 3.1.A: Implement with int.
        reverse(head);
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    private void reverse(LinkedListNode<T> node) {
        // TODO Lab 3.1.A: Implement with int.
        if(node == null){
            return;
        }
        reverse(node.getNext());
        System.out.println(node.getValue());
        // TODO Lab 3.1.B: Modify to use generics, instead of int.
    }

    public int traverseList(boolean print) {
        int count = 0;
        LinkedListNode<T> curNode = head;
        while (curNode != null) {
            if (print) {
                System.out.println(curNode);
            }
            curNode = curNode.getNext();
            count++;
        }
        return count;
    }

    public LinkedListNode<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode<T> cur = head;
        while (cur != null) {
            builder.append(cur);
            builder.append("\n");
            LinkedListNode<T> next = cur.getNext();
            if (next != null) {
                cur = next;
            } else {
                cur = null;
            }
        }
        return builder.toString();
    }

}
