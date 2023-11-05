package java_printprogramme_week9;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */


public class Programme_3_ReverseArray {

    int[] originalArray = {10, 20, 30, 40, 50};




        public static void main (String[]args){
            int[] originalArray = {10, 20, 30, 40, 50};
            System.out.println("Original Array:" + Arrays.toString(originalArray));

            int[] reversedArray = reverseIntArray(originalArray);
            System.out.println("Reversed Array:" + Arrays.toString(reversedArray));
        }

    public static int[] reverseIntArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}