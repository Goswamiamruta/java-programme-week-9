package java_printprogramme_week9;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.List;


public class Programme_6_RetrieveElementAtIndex {
        public static void main (String[]args){
            // Create an ArrayList and add elements
            List<String> names = new ArrayList<>();
            names.add(" Amruta ");
            names.add(" Bhumi ");
            names.add(" Charvi ");
            names.add(" Devanshi ");
            names.add(" Eva ");

            // Specify the index you want to retrieve
            int indexToRetrieve = 2;

            // Check if the index is within the valid range
            if (indexToRetrieve>=0 && indexToRetrieve< names.size()) {
                String element = names.get(indexToRetrieve);
                System.out.println("Element at index " + indexToRetrieve + ": " + element);
            } else {
                System.out.println("Index is out of range.");
            }
        }
    }







