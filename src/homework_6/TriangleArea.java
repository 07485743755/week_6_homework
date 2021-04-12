package homework_6;

import java.util.Scanner; //import Scanner class

public class TriangleArea {

    // Write a program to calculate the area of a triangle.

    // Instance method
    void triangle(){

        int height,base,area; //local area
        Scanner s=new Scanner(System.in); //create object
        System.out.println("Enter the value for height of the triangle:");
        height=s.nextInt(); //assign the value for h at run time
        System.out.println("Enter the value for base of the triangle");
        base=s.nextInt(); //assign the value for b at run time

        area=height*base/2; //formula for find area of triangle

        System.out.println("Area of triangle: "+area);

    }

    //Main Method

    public static void main(String[]args){

        TriangleArea tri=new TriangleArea(); //create object
        tri.triangle(); //call instance method in main method via object

    }
}
