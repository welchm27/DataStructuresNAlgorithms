package com.algorithms;

public class SearchAlgorithm {

    public static int linearSearch(int needle, int[] haystack) {
        // Lab2.1.A: Implement Linear search logic.
        int position = -1;
        int index = 0;
        int iterationCounter = 0;
        while (index < haystack.length){
            iterationCounter++;
            if (haystack[index] == needle){
                position = index;
                break;
            }
            index++;
        }
        System.out.println("Linear Iteration Count: " + iterationCounter);
        return position;
    }

    public static int binarySearch(int needle, int[] haystack) {
        // Lab2.1.B: Implement binary search logic here using iteration; include counter
        //  variable and print statements to show number of iterations.
        if(haystack == null)
            return -1;


        int low = 0;
        int high = haystack.length;
        int position = -1;
        int iterationCounter = 0;

        while (low < high){
            iterationCounter++;
            int middle = (low + high)/2;
            int middleValue = haystack[middle];
            if (middleValue < needle){
                low = middle + 1;
            }else if (middleValue > needle){
                high = middle;
            }else {
                position = middle;
                break;
            }
        }
        System.out.println("Iteration count: " + iterationCounter);
        return position;
    }

    // TODO-Lab2.1.C (optional): Modify binarySearch logic to use recursion, completing the method
    //  below, and modifying the method above to invoke the method below. For the recursive
    //  approach, don't bother counting the number of iterations/invocations.
    private static int binarySearch(int needle, int[] haystack, int low, int high) {
        // TODO-Lab2.1.C (optional): Implement binary search logic here using recursion.
        int position = -1;

        if (low < high){
            int middle = (low + high)/2;
            int middleValue = haystack[middle];
            // shorthand if else  ? = if that is true, do this.
            // : is the next else if
            position = (middleValue < needle) ? binarySearch(needle, haystack, middle +1, high)
                    : (middleValue > needle) ? binarySearch(needle, haystack, low, middle)
                    : middle;
        }


        /*
        while (low < high){
            iterationCounter++;
            int middle = (low + high)/2;
            int middleValue = haystack[middle];
            if (middleValue < needle){
                low = middle + 1;
                binarySearch(needle, haystack, low, high);
            }else if (middleValue > needle){
                high = middle;
                binarySearch(needle, haystack, low, high);
            }else {
                position = middle;
                break;
            }
        }
        */
        return position;
    }

    public static void main(String[] args) {
        int[] unsorted = new int[]{3, 7, 1, 5, 13, 11, 15};
        int[] sorted = new int[]{1, 4, 6, 8, 9, 10, 12, 13, 23, 44};
        //Lab2.1.A: Invoke linearSearch(int, int[]) method (and print the result) twice: once
        //  with a value actually present in the array, and once with a value not in the array.
        System.out.println(SearchAlgorithm.linearSearch(7, unsorted));
        System.out.println(SearchAlgorithm.linearSearch(2, unsorted));
        //Lab2.1.B: Invoke binarySearch(int, int[]) method (and print the result) twice: once
        //  with a value actually present in the array, and once with a value not in the array.
        System.out.println();
        System.out.println(SearchAlgorithm.binarySearch(10, sorted, 0, 9));
        System.out.println(SearchAlgorithm.binarySearch(7, sorted, 0, 9));


    }

}