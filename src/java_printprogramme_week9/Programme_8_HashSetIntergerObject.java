package java_printprogramme_week9;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

public class Programme_8_HashSetIntergerObject {
    // static method
    public static void addNumber(HashSet<Integer> set, int number) {
        if (number >= 1 && number <= 10) {
            set.add(number);
        } else {
            System.out.println("Enter a number between 1 and 10:");
        }
    }
    // main method
    public static void main(String[] args) {
        int number;
        //using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        HashSet<Integer>numberSet = new HashSet<>();
        //Store number in set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        number = scanner.nextInt();
        addNumber(numberSet,number);
        System.out.println("Number between 1 to 10 that are in set:");
        for (int i = 1; i <=10;i++){
            if (numberSet.contains(i)){
                System.out.println(i);
            }
        }
        //Closing the scanner object
        scanner.close();
    }
}