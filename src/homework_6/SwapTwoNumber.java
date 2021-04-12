package homework_6;

import java.util.Scanner;  //Import Scanner Class

public class SwapTwoNumber {
    //Write a Java program to swap two variables.

    //static Method

    static void swapNumber(){

        int first,second,third;  //Local variable
        Scanner num=new Scanner(System.in); //create object

        System.out.print("Enter first number: ");
        first=num.nextInt();
        System.out.print("Enter second number: ");
        second=num.nextInt();

        //Logic for swap number

        third=first;
        first=second;
        second=third;
        System.out.println("After swaping number");
        System.out.println("First number: "+first);
        System.out.println("Second number: "+second);

    }

    //Main Method

    public static void main (String[]args){

        swapNumber(); //call static method in main method -direct

    }
}
