package com.algorithms;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryConvertTest {

    // Lab1.3: After completing test plan, implement unit tests.


    @Test
    public void convertFromBinary_valid() {
        String[] binaryStr = {"0", "1", "110", "1101", "100101"};

        int[] expected = {0, 1, 6, 13, 37};
        for(int num = 0; num < expected.length; num++){
            int actual = BinaryConvert.convertFromBinary(binaryStr[num]);
            assertEquals(expected[num], actual);
        }
    }


    @Test
    public void convertFromOctal_valid() {
        String[] octalStr = {"0", "7", "10", "4321", "54321"};

        int[] expected = {0, 7, 8, 2257, 22737};
        for (int num = 0; num < expected.length; num++){
            int actual = BinaryConvert.convertFromOctal(octalStr[num]);
            assertEquals(expected[num], actual);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromBinary_InvalidForRadix() {
        BinaryConvert.convertFromBinary("100102");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertFromOctal_InvalidForRadix(){
        BinaryConvert.convertFromOctal("24290");
    }


}
