package homework_6;

import java.util.Scanner; //import scanner class

public class TemperatureValue {

    /*Write a program to insert any temperature value in degree Fahrenheit and
    convert to degree Celsius ((F − 32) × 5/9 = 0°C). */

    static void temp(){

        double f,c; //local variable
        Scanner s=new Scanner(System.in); //create object
        System.out.println("Enter the value for Temperature in fahrenheit: ");
        f=s.nextDouble();
        c= (f-32)/1.80;
        System.out.println("Temperature in celsius: "+c);
    }

    //main method
    public static void main(String[]args){

        temp(); //call static method in main method -direct

    }
}
