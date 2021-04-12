package homework_6;

import java.util.Scanner; //Import

public class ArithmeticOperator {

    /*. Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.
    Test Data: Input first number: 125 , Input second number: 24
    Expected Output :
    125 + 24 = 149
    125 - 24 = 101
    125 x 24 = 3000
    125 / 24 = 5
    125 mod 24 = 5*/

    int a; //Instance variable
    static int b; //static variable


    //Instance Method
    void arithmetic() {

        int sum, subtraction, multi, div,mod; //Local variable
        Scanner num = new Scanner(System.in); //create a class
        System.out.println("Input the first value: ");
        a = num.nextInt(); //
        System.out.println("Input the second value");
        ArithmeticOperator.b = num.nextInt();

        sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

        subtraction = a - b;
        System.out.println(a + " - " + b + " = " + subtraction);

        multi = a * b;
        System.out.println(a + " * " + b + " = " + multi);

        div = a / b;
        System.out.println(a + " / " + b + " = " + div);

        mod=a%b;
        System.out.println(a+" mod "+b+" = "+mod);

    }

    //Main Method

    public static void main(String[]args){


        ArithmeticOperator arith=new ArithmeticOperator(); //create object
        arith.arithmetic();  //call instance method in main method

    }

}
