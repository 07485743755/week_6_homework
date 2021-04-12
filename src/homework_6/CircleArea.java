package homework_6;

import java.util.Scanner; //import Scanner class for enter value at run time

public class CircleArea {

    /*Write a program to enter any radius value of the circle and find out the  area.
    (Formula of Area A=PI*r*r). */

    //Instance Method

    void circle() {
        float r,circleArea;
        Scanner s = new Scanner(System.in); //create object s
        System.out.println("Enter the value for Radius: ");
        r = s.nextFloat(); //assign the value in r variable
        circleArea=22*r*r/7; //formula for find area of circle
        System.out.println("Area of circle: "+circleArea);
    }

    //Main method

    public static void main(String[]args){

        CircleArea area=new CircleArea(); //create object
        area.circle(); //call instance method in main method(static area) via object

    }
}
