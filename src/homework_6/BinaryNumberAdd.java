package homework_6;

import java.util.Scanner;

public class BinaryNumberAdd {

    /*Write a Java program to add two binary numbers.
    Input Data:
    Input first binary number: 10
    Input second binary number: 11
    Expected Output:
    Sum of two binary numbers: 101*/

    //Instance method
    void binary() {

        int d1, d2, d;  //Local variable
        Scanner str = new Scanner(System.in);  //create object

        System.out.println("Input first binary number: ");
        String b1 = str.nextLine();
        System.out.println("Input second binary number: ");
        String b2 = str.nextLine();
        d1 = Integer.parseInt(b1, 2);
        d2 = Integer.parseInt(b2, 2);
        d = d1 + d2;
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(d));

    }

    //Main Method
    public static void main(String[] args) {

        BinaryNumberAdd obj = new BinaryNumberAdd(); //create object
        obj.binary(); //call Instance method in main method

    }


}
