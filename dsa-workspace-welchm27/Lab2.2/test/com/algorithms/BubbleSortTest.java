package com.algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class BubbleSortTest {

    // TODO: Create test methods for bubble sort implementation.

    @Test
    public void sortNullArray(){
        int[] array = null;
        BubbleSort.sort(array);
//        HashSet<Integer> actual = null;
//        List<Integer> expected = null;
//        assertEquals(expected, actual);
        Assert.assertArrayEquals(null, array);

    }

    @Test
    public void sortArrayTest(){
        int[] array = {3, 7, 2, 15, 8, 4, 6, 5, 1};
        BubbleSort.sort(array);

        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        assertArrayEquals(expected, array);
    }
}