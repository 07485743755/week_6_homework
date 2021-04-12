package homework_6;

public class MathsCalculation {
    /*2. Write a Java program to compute the specified expressions and print the output.
    Test Data:
    ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
    Expected Output : 2.138888888888889 */

    double a = 25.5; //Instance variable
    double b = 3.5; //Instance variable
    static double c = 40.5; //Static variable
    static double d = 4.5; //Static variable

    //Static Method

    static void math(){

        double e;    //Local variable
        MathsCalculation maths=new MathsCalculation(); //Create object
        e=(maths.a * maths.b - maths.b * maths.b)/( c - d );  //call instance and static variable
        System.out.println(e);
    }

    //Main Method
    public static void main(String[]args){

        math(); //call static method in main method - direct
    }

}
