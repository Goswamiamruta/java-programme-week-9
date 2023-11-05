package java_printprogramme_week9;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4_ColorArrayList {
    // Adding colour to the ArrayList
    public static void colors() {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("orange");
        for (String color : colors) {
            System.out.println(color);
        }

    }


    // Printing the collection using a for-each loop
    public static void main(String[] args) {
        colors();
        System.out.println("Colour in the ArrayList:");

    }

}


