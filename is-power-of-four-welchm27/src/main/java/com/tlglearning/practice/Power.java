package com.tlglearning.practice;

/**
 * Defines a single static method, {@link #isPowerOfFour(long)}, which evaluates a specified value
 * to determine whether it is an integral power of 4.
 */
public abstract class Power {

  private Power() {
    // NOTE: There is NO need to do anything with this constructor! The method you will implement
    //       in this class is static; thus, there is no need to create instances of this class.
  }

  /**
   * Computes and returns a {@code boolean} flag indicating whether the provided {@code input} is a
   * power of four. A non-positive (zero or negative) {@code input} value will result in 
   * {@link IllegalArgumentException} being thrown.
   *
   * @param input Value to be tested.
   * @return Flag indicating whether {@code input} is an integral power of four.
   * @throws IllegalArgumentException When {@code input} is non-positive (zero or negative).
   */
  public static boolean isPowerOfFour(long input) throws IllegalArgumentException {
    boolean status = false;
    if (input <= 0) {
      throw new UnsupportedOperationException("Not a valid input"); // Implement as specified.
    }
    // if input can be expressed as 4^n, where the integer n>=0, return true
    if(input == 1) {
    status = true;
    // check if the number can be divided evenly by 4
      // && check if Math.log(input) / Math.log(4) returns a whole number, meaning it's a power of 4
    }else if (input % 4 == 0 && (Math.log(input) / Math.log(4) % 1 == 0)){
    status = true;
    }
    // otherwise return false
    return status;
  }
}
