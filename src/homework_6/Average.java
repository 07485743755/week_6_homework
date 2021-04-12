package homework_6;

import java.util.Scanner; //import Scanner class

public class Average {

    //Static Method

    static void avgNum() {

        int first,second,third,avg; //Local variable

        Scanner num = new Scanner(System.in); //create object
        System.out.println("Enter the value for First number: ");
        first = num.nextInt(); //assign the value for first number at run time
        System.out.println("Enter the value for Second number: ");
        second = num.nextInt(); //assign the value for second number at run time
        System.out.println("Enter the value for Third number: ");
        third = num.nextInt(); //assign the value for third number at run time

        avg=(first+second+third)/3;

        System.out.println("Average of three number= "+ avg);
    }

    //main method

    public static void main (String[]args){

        avgNum(); //call static method in main method

    }
}
