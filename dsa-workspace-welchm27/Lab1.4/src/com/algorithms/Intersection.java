package com.algorithms;

import java.util.*;

public class Intersection {

    public static void main(String args[]) {
        int[] a = {4, 7, 5, 2, 3};
        int[] b = {4, 2, 3, 9, 1};
        Intersection simpleIntersection = new Intersection();
        System.out.println(simpleIntersection.intersection(a, b));
        System.out.println(simpleIntersection.intersectionFast(a, b));
    }

    public Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    result.add(x);
                }
            }
        }
        return result;
    }

    public Set<Integer> intersectionFast(int[] a, int[] b) {
        // TODO-Lab1.4: Implement fast intersection logic here
        Set<Integer> result = new HashSet<>();
        Arrays.sort(a);  // nlog(n)
        Arrays.sort(b);  // nlog(n)
        for (int indexA = 0, indexB = 0; indexA < a.length && indexB < b.length; ) {
            int valueA = a[indexA];
            int valueB = b[indexB];

            if(valueA == valueB){
                result.add(valueA);
                indexA++;
                indexB++;
            }else if (valueA < valueB) {
                indexA++;
            }else{
                indexB++;
            }
        } // --> O(n)
        return result;
    }  // --> 2 + 2nlog(n)


}
