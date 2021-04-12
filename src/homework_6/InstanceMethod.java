package homework_6;

public class InstanceMethod {

    /* Write a Java programme using the following steps.
            1.1 Declare two instance variables.
            1.2 Declare one instance method.
            1.3 Call both instance variables into the instance method inside the print statement.
            1.4 Declare the Main method.
            1.5 Call the above instance method into the Main method and Run the programme.
     */

    //instance variable
    int a=143;
    boolean result = true;

    //create instance method
    void instanceMethod(){

        System.out.println(a); //call instance variable
        System.out.println(result); //call instance variable

    }

    //main method
    public static void main (String[]args){

        InstanceMethod obj=new InstanceMethod();//create object for call instance method in static area
        obj.instanceMethod();

    }
}
