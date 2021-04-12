package homework_6;

public class StaticInstancePractice2 {

    /* 4.1 Declare two instance and two static variables.
   4.2 Declare one instance method.
   4.3 Declare one static method.
   4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
   4.5 Declare the Main method.
   4.6 Call both instance and static methods into the Main method and run the programme.*/

    int a = 76; //Instance variable
    double b = 43.98; //Instance variable
    static String name = "Practice"; //static variable
    static char c = 'N'; //static variable

    //Instance variable

    void javaPrac() {

        System.out.println(a); //call instance variable in instance area
        System.out.println(b); //call instance variable in instance area
        System.out.println(StaticInstancePractice2.name); //call static variable via class name
        System.out.println(StaticInstancePractice2.c); //call static variable via class name

    }

    //Static method

    static void javaPractice1() {

        StaticInstancePractice2 sip = new StaticInstancePractice2(); //create object
        System.out.println(sip.a); //call instance variable in static area
        System.out.println(sip.b); //call instance variable in static area
        System.out.println(name); //call static variable in static area
        System.out.println(c); //call static variable in static area

    }

    //Main method
    public static void main(String[] args) {

        System.out.println("Output for Instance Method");
        StaticInstancePractice2 obj = new StaticInstancePractice2();
        obj.javaPrac(); //call instance method in main method(static area) via object
        System.out.println("Output for Static Method");
        javaPractice1(); //call static method in main method-direct

    }
}
