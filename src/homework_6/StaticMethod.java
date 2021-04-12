package homework_6;

public class StaticMethod {
    /*2.1 Declare two static variables
    2.2 Declare one static method
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and Run the programme. */

    //static variables
    static String firstName="Nidhi";
    static String lastName="Lathiya";

    //create static method

    static void staticMethod(){

        System.out.println("First Name: "+firstName); //call static variable
        System.out.println("Last Name: "+lastName); //call static variable

    }

    //main method

    public static void main(String[]args){

        staticMethod(); //call static method in static area(main method)
    }

}
