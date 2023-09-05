package com.algorithms;

public class BinaryConvert {

    private static final String NULL_STRING_MESSAGE = "Cannot parse null string";
    private static final String DIGIT_TOO_LARGE = "Cannot parse \"%1$s\"; digit value \"%2$d\" is too large for the radix %3$d. ";

    public static int convertFromBinary(String binary) {
        if(binary == null){
            throw new NumberFormatException(NULL_STRING_MESSAGE);
        }
        int result = 0;
        int positionValue = 1;
        char[] digits = binary.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            char digit = digits[i];
            int digitValue = Character.getNumericValue(digit);
            if(digitValue < 0 || digitValue > 1){
                throw new NumberFormatException(String.format(DIGIT_TOO_LARGE, binary, digitValue, 2));
            }
            if (binary.charAt(i) == '1') {
                result += positionValue;
            }
            positionValue *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        if(octal == null){
            throw new NumberFormatException(NULL_STRING_MESSAGE);
        }
        int result = 0;
        int positionValue = 1;
        char[] digits = octal.toCharArray();
        for (int i = digits.length - 1; i >= 0; i--) {
            int digitValue = Character.getNumericValue(digits[i]);
            if(digitValue < 0 || digitValue > 7){
                throw new NumberFormatException(String.format(DIGIT_TOO_LARGE, octal, digitValue, 8));
            }
            if (digitValue >= 0 && digitValue < 8) {
                result += positionValue * digitValue;
            }
            positionValue *= 8;
        }
        return result;
    }

}
