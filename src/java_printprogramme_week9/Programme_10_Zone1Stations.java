package java_printprogramme_week9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Programme_10_Zone1Stations {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 station name: ");
        String stationName = scanner.nextLine();

        // Create a HashMap to map station  names to their respective lines

        Map<String, String> stationToLine = new HashMap<>();
        stationToLine.put("Baker Street", "Bakerloo, Jubilee, Metropolitan, Circle, Hammersmith & City");
        stationToLine.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationToLine.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        stationToLine.put("King's Cross St Pancras", "Piccadilly, Northern, Victoria, Circle, Hammersmith & City, Metropolitan");

          if (stationToLine.containsKey(stationName)) {
            String lines = stationToLine.get(stationName);
            System.out.println("The station " + stationName + " is in Zone 1 and is served by the following lines: " + lines);
        } else {
            System.out.println("The station " + stationName + " is not in Zone 1 or is not found in the map.");
        }

        //Closing the scanner object
        scanner.close();

    }


}
