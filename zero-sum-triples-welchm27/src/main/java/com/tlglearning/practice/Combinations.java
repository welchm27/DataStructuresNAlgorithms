package com.tlglearning.practice;

import java.util.*;

/**
 * Implements a search for zero-sum triples in an array of {@code int} values.
 */
public abstract class Combinations {

  private Combinations() {
    // NOTE: There is NO need to do anything with this constructor! The method
    //       you will implement in this class is static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Finds and returns all zero-sum triples (each encapsulated in a 3-element {@link Set
   * Set&lt;Integer&gt;}) contained in {@code data}.
   *
   * @param data Values to search.
   * @return All zero-sum triples in {@code data}.
   */
  public static Set<? extends Set<Integer>> zeroSumTriples(int[] data) {
    if (data == null) {
      throw new UnsupportedOperationException("Not yet implemented"); // TODO Implement as specified.
    }
    Set<Set<Integer>> zeroSumTriples = new HashSet<>();

    for (int i = 0; i < data.length - 2; i++){
      for (int j = i + 1; j < data.length - 1; j++){
        for (int k = j + 1; k < data.length; k++){
          if (data[i] + data[j] + data[k] == 0){
            Set<Integer> triple = new HashSet<>(Arrays.asList(data[i], data[j], data[k]));
            zeroSumTriples.add(triple);
          }
        }
      }
    }
    return zeroSumTriples;
  }

  public static void main(String[] args) {
    int arr[] = {0, -1, 2, -3, 1};
    int[] inputLarge = {7, 10, 2, -4, -7, 9, -6, -8, 8, 6, -10, -9, 5, 4, -2, -1, -5, 3};
    zeroSumTriples(arr);
//    System.out.println(zeroSumTriples(arr));
//    System.out.println(zeroSumTriples(inputLarge));

    int[] inputSmall = {1, -2, 2, 5, 3, 0, -4, -1};
    Set<Set<Integer>> expectedSmall = new HashSet<>();
    expectedSmall.add(Set.of(1, 3, -4));
    expectedSmall.add(Set.of(1, 0, -1));
    expectedSmall.add(Set.of(-2, 2, 0));
    expectedSmall.add(Set.of(-2, 3, -1));
    expectedSmall.add(Set.of(5, -4, -1));
    System.out.println("expected small: " + expectedSmall);

    Set actual = Combinations.zeroSumTriples(inputSmall);
    System.out.println("Set Actual: " + actual);
  }
}