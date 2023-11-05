package Programe_1_calculate;

public class Calculator {
    int a =10;
    int b = 20;

    // instance addition method
    public void addition (int a,int b){

        System.out.println("Addition of" + a + " and " + b + "is:" + (a+b));
    }
    // instance subtraction method

    public void subtraction (int a, int b){

        System.out.println("Subtraction of" + a + " and " + b + "is:" +(a-b));

    }
    // instance multiplication method

    public void multiplication(int a,int b){

        System.out.println("Multiplication of" + a + " and " + b + "is:" +(a*b) );

    }
    // instance division method

    public void division (int a,int b){

        System.out.println("Division of" + a + " and " + b + "is:" + (a/b));
    }
    public void calculateResult(int a,int b,char c) {
        switch (c) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;


        }
    }






    }


