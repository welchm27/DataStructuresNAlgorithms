package com.algorithms;

public class BinaryConvert {

    public static void main(String[] args) {
        int value = convertFromBinary("100101");
        System.out.println("Decimal value of binary 100101 = " + value);
        int oValue = convertFromOctal("1");
        System.out.println("Octal value is: " + oValue);
        int hValue = convertFromHexadecimal("1A");
        System.out.println("Hex value is: " + hValue);
        // Lab1.2: Uncomment first 2 and/or last 2 lines of the following, for a simple check
        //  of octal or hexadecimal conversion.
//        value = convertFromOctal("17");
//        System.out.println("Decimal value of octal 17 = " + value);
//        value = convertFromHexadecimal("2A");
//        System.out.println("Decimal value of hexadecimal 2A = " + value);
    }

    public static int convertFromBinary(String binary) {
        int result = 0;
        int positionValue = 1;
        char[] digits = binary.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += positionValue;
            }
            positionValue *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        // Lab1.2: Complete this method, to return calculated decimal value converted from
        //  octal String, or the following.
       int result = 0;
       int positionValue = 1;

       char[] digits = octal.toCharArray();

       for (int i = digits.length - 1; i >= 0; i--){
           int n = Integer.parseInt(String.valueOf(octal.charAt(i)));
           result += n * positionValue;
           positionValue *= 8;
       }
       System.out.println(result);
       return result;

    }

    public static int convertFromHexadecimal(String hexadecimal) {
        // Lab1.2: Complete this method, to return calculated decimal value converted from
        //  hexadecimal String, or the preceding method.
        if (hexadecimal == null){
            return -1;
        }
        // establish result as 0
        int result = 0;
        // establish positionValue as 1 for multiplying first index location
        int positionValue = 1;
        // add hexadecimal number to char array to iterate through
        char[] digits = hexadecimal.toCharArray();
        // loop backwards through the array
        for(int i = digits.length - 1; i >= 0; i--){
            // Using the Character.getNumericValue function, turn the digit at i to its numeric value
            int digitValue = Character.getNumericValue(digits[i]);
            // confirm that numeric value is between 0 and 15 (0-9, A, B, C, D, E, F)
            if (digitValue >= 0 && digitValue < 16){
                // add position value * digitValue to the result
                result += positionValue * digitValue;
            }
            // increment position value to account for the value at the next position
            positionValue *= 16;
        }
        // return the result
        return result;
    }

}
