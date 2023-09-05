package com.algorithms;

public class MergeSort {

    public static void main(String[] arg) {
        MergeSort sorter = new MergeSort();
        int[] array = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println("Unsorted:");
        for (int a : array) {
            System.out.println(a);
        }
        sorter.mergeSort(array);
        System.out.println("Sorted:");
        for (int a : array) {
            System.out.println(a);
        }
    }

    public void mergeSort(int[] array) {
        if (array != null) {
            mergeSort(array, 0, array.length-1);
        }
    }

    private void mergeSort(int[] array, int start, int end) {
        // Implement the logic below
        //   If sort range is not empty:
        if(start < end) {
            //     1. Find middle position.
            int middle = (end - start)/2 + start;
            //     2. Sort (recursively) left side (start to middle).
            mergeSort(array, start, middle);
            //     3. Sort (recursively) right side (middle to end).
            mergeSort(array, middle+1, end);
            //     4. Merge left and right sides.
            merge(array, start, middle+1, end);
        }
    }

    private void merge(int[] array, int left, int right, int end) {
        // Implement the logic below
        //   1. Create a destination array.
        int lsub = left;
        int rsub = right;
        // the temporary array that will hold the left and right sub arrays
        int[] arrayTemp = new int[(end - left) + 1];
        //   2. Starting from the lowest position in both left and right sides, and continuing until
        //          one of the two sides is exhausted.

        for (int i = 0; i < arrayTemp.length; i++){

            if(lsub <= right-1 && (rsub > end || array[lsub]<= array[rsub])){
                arrayTemp[i] = array[lsub];
                lsub++;
            }else{
                arrayTemp[i] = array[rsub];
                rsub++;
            }


            /*
            // if you've already completed one side of the array
            // add the rest of the other side to the arrayTemp
            if(lsub > rsub){
                arrayTemp[i] = array[rsub];
                rsub++;
            }else if (lsub < rsub){
                arrayTemp[i] = array[lsub];
                lsub++;
            }
            // check which side has the lower value and add it to the arrayTemp
            if(array[lsub] < array[rsub]){
                arrayTemp[i]= array[lsub];
                lsub++;
            }else if(array[lsub] > array[rsub]){
                arrayTemp[i] = array[rsub];
                rsub++;
            }

             */

        }
        //     a. If value on left is less than value on right:
        //        - Copy value from left to destination array.
        //        - Advance to next position on left.
        //        Otherwise:
        //        - Copy value from right to destination array.
        //        - Advance to next position on right.
        //     b. Advance to next position in destination array.
        //  3. Copy any remaining values from side that is not yet exhausted to destination.
        //  4. Copy values back from destination to original array.
        System.arraycopy(arrayTemp, 0, array, left, arrayTemp.length);
    }

}
