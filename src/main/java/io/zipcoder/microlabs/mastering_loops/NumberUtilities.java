package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder evenNumbers = new StringBuilder();
        for (int i = start; i < stop; i++)
            if (i % 2 == 0) {
                evenNumbers.append(i);
            }
        String output = evenNumbers.toString();
        return output;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        for (int i = start; i < stop; i++)
            if (i % 2 != 0) {
                oddNumbers += i;
            }
        return oddNumbers;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        String range = "";
        for (int i = 0; i < stop; i++) {
            range += i;
        }
        return range;
    }

    public static String getRange(int start, int stop) {
        String range = getRange(start, stop, 1);
        return range;
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i = i + step) {
            range += i;
        }
        return range;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String output = "";
        for (int i = start; i < stop; i = i + step) {
            output += Math.round(Math.pow(i, exponent));
        }
        return output;
    }
}
