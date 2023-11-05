package java_printprogramme_week9;


import java.util.*;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Programme_5_ArrayListIteration {

    // Adding fruits to the ArrayList

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println("Iterating through the ArrayList using Iterator:");

        // Creating an Iterator to iterate through the ArrayList
        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruits);

        }


    }
}