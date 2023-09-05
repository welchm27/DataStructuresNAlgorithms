package com.tlglearning.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.InvalidApplicationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    public void isPowerOfFour_testOne_shouldReturnTrue() {
        long n = 1;
        assertTrue(Power.isPowerOfFour(n));
    }

    @Test
    public void isPowerOfFour_testLong_shouldReturnTrue() {
        long n = 4_294_967_296L;
        assertTrue(Power.isPowerOfFour(n));
    }

    @Test
    public void isPowerOfFour_testShortNumber_shouldReturnFalse() {
        long n = 65;
        assertFalse(Power.isPowerOfFour(n));
    }

    @Test
    public void isPowerOfFour_testLong_shouldReturnFalse() {
        long n = 8_589_934_592L;
        assertFalse(Power.isPowerOfFour(n));
    }

    @Test
    public void isPowerOfFour_testZero_shouldThrowException() {
        long input = 0;
        assertThrows(UnsupportedOperationException.class, () -> {
            Power.isPowerOfFour(input);
                });
    }

    @Test
    public void isPowerOfFour_testNegative_shouldThrowException() {
        long input = -16;
        assertThrows(UnsupportedOperationException.class, () -> {
            Power.isPowerOfFour(input);
        });
    }

}