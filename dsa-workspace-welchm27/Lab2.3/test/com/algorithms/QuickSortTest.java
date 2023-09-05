package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    QuickSort quickSort;

    @Before
    public void setup(){
        quickSort = new QuickSort();
    }

    @Test
    public void sortedCorrectly() {
        int[] numbers = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        quickSort.sort(numbers);
        int[] expected = {1, 3, 4, 5, 16, 17, 21, 33};
        assertArrayEquals(expected, numbers);
        System.out.println(Arrays.toString(numbers));

    }

    @Test
    public void sortNullArray(){
        int[] array = null;
        quickSort.sort(array);
        assertArrayEquals(null, array);
    }
}