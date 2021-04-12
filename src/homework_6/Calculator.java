package homework_6;

public class Calculator {

    /*Write a program for a calculator with addition,subtraction,multiplication  and division methods
    all with parameters and use string concatenation  methods.
    (Note: Two static and Two instance methods.)*/

    int a = 45; //instance variable
    static int b = 9; //static variable

    //Instance Method

    void add() {
        int add1; //Local variable
        add1 = a + Calculator.b; //call static variable b via class name for addition
        System.out.println("Addition: " + add1); //using string concatenation method
    }

    //Instance Method

    void sub() {
        int sub1; //Local variable
        sub1 = a - Calculator.b; //call static variable b via class name for subtraction
        System.out.println("Subtraction: " + sub1); //using string concatenation method

    }

    //Static Method

    static void multi() {
        int multi1; //Local variable
        Calculator calci = new Calculator(); //create object calci
        multi1 = calci.a * b; //call instance variable a via object calci for multiplication
        System.out.println("Multiplication: " + multi1);

    }

    //Static Method

    static void div() {

        int div1; //Local variable
        Calculator calci1 = new Calculator(); //create object calci1
        div1 = calci1.a / b; //call instance variable a via object calci1 for Division
        System.out.println("Division: " + div1);

    }

    //Main Method
    public static void main(String[] args) {

        Calculator calci2 = new Calculator();
        calci2.add(); // call instance method add in main method
        calci2.sub(); // call instance method sub in main method
        multi();      // call static method multi in main method
        div();        // call static method div in main method

    }
}
