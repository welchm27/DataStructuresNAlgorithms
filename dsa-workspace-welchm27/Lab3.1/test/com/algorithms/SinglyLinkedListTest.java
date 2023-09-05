package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    SinglyLinkedList<Customer> custList = null;

    @Before
    public void setup(){
        custList = new SinglyLinkedList<>();
        custList.addFront(new Customer(1234, "Andrew Smith", 255));
        custList.addFront(new Customer(23456, "Betty Smith", 355));
        custList.addFront(new Customer(34567, "Charlie Smith", 455));
        custList.addFront(new Customer(45678, "Dora Smith", 555));
        custList.addFront(new Customer(56789, "Edward Smith", 655));
        custList.addFront(new Customer(67890, "Francie Smith", 755));
        custList.addFront(new Customer(78901, "Gregory Smith", 855));
    }

    @Test
    public void deleteFrontValid(){
        custList.deleteFront();
        int expectedCustNo = 67890;

        LinkedListNode<Customer> head = custList.getHead();
        int actualCustNo = head.getValue().getCustNo();
        assertEquals(expectedCustNo, actualCustNo);
    }

    @Test
    public void sizeCheck(){

        int expectedSize = 7;
        int actualSize = custList.traverseList(true);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void reverseCheck(){
        int expectedCustNo = 1234;
        custList.reverse();
        LinkedListNode<Customer> head = custList.getHead();
        int actualCustNo = head.getValue().getCustNo();
    }

    @Test
    public void addOnPositionCheck(){
        System.out.println(custList);
        Customer cust = new Customer(123456, "Michael Welch", 999);
        custList.addInPosition(cust, 1);
        System.out.println(custList);
    }
}