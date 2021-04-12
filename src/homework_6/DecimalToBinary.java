package homework_6;

import java.util.Scanner; //Import Scanner class

public class DecimalToBinary {

    /*Write a Java program to convert a decimal number to binary number.
    Input Data:
    Input a Decimal Number : 5
    Expected Output
    Binary number is: 101*/

    //Instance Method
    void convertor() {

        int num;  //Local variable
        Scanner s = new Scanner(System.in); //create object
        System.out.print("Input a decimal number =  ");
        num = s.nextInt();


        // convert integer to binary

        String binary = Integer.toBinaryString(num);
        System.out.println("Converted binary number = " + binary);

    }

    //Main Method
    public static void main(String[] args) {

        DecimalToBinary dec = new DecimalToBinary(); //create object
        dec.convertor(); //call instance method in main method via object

    }
}
