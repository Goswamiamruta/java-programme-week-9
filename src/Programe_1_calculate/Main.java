package Programe_1_calculate;

import java.util.Scanner;

public class Main    {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        char y;
        do {
            System.out.println("Enter first Number:");
            int a = scanner.nextInt();
            System.out.println("Enter second Number:");
            int b = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /:");
            char c = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            if (c=='+'){
                calculator.addition(a,b);
            }
            else if (c=='/'){
                calculator.division(a,b);
            }
            else if (c=='-'){
                calculator.subtraction(a,b);
            }
            else if (c=='*'){
                calculator.multiplication(a,b);
            }
            else {
                System.out.println("invalid input");
            }
            System.out.println("Would you like to do more calculation Please enter “Y” or “N” :");
            y= scanner.next().charAt(0);
        }
        while (y == 'Y'||y == 'y');
        System.out.println("programme terminated.");
        //Closing the scanner object
        scanner.close();
    }
}