package java_printprogramme_week9;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */

public class Programme_9_HashMapExample {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        // Create a HashMap to store String keys and Integer values
        HashMap<String, Integer> people = new HashMap<>();
        // Use a loop to add key-value pairs to the map
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a name: ");
            String name = scanner.next();
            System.out.print("Enter an age: ");
            int age = scanner.nextInt();
            // Add the key-value pair to the map
            people.put(name, age);
        }
        System.out.println("Ages in the map:");
        // Iterate through the values using a for-each loop
        for (Integer age : people.values()) {
            System.out.println("Age: " + age);
        }
        //Closing the scanner object
        scanner.close();
    }
}