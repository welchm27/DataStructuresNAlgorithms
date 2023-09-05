package com.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {22, 15, 13, 9, 6, 3, 1};
        System.out.println(Arrays.toString(input));
//        sort(input);
//        System.out.println(Arrays.toString(input));

        sortWhile(input);
        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] numbers) {
        // implement bubble sort pseudocode
        // check if the array is null or not
        if(numbers == null) {
            System.out.println("The input array is empty");
            return;
        }
        int n = numbers.length;
        int count = 0;

        for (int i = 1; i < n; i++){
            for(int j = 0; j < (n-1); j++){
                count++;  // O(n^2)

                if (numbers[j] > numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        System.out.println("Iteration for array of length " + numbers.length + ":" + count);
    }

    public static void sortWhile(int[] numbers){
        if(numbers == null){
            System.out.println("The input array is empty");
            return;
        }
        boolean swapped = true;
        int n = numbers.length;
        int tmp = 0;
        int count = 0;

        while(swapped){
            swapped = false;
            for(int i = 0; i < n-1; i++){
                if(numbers[i] > numbers[i+1]){
                    tmp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = tmp;
                    swapped = true;
                }
                count++;
            }
            n--;
        }
        System.out.println("Iteration for while loop with array of length " + numbers.length + ":" + count);
    }

}
