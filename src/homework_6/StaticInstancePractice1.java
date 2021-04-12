package homework_6;

public class StaticInstancePractice1 {
    /*3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme*/

    char d = 'a'; //instance variable
    static double e= 10.6; //static variable

    //instance method

    void instance(){
        System.out.println(d);
       System.out.println(StaticInstancePractice1.e);
    }

    //static method

    static void staticM(){
        System.out.println(e);//call static variable in static method -direct
        StaticInstancePractice1 obj=new StaticInstancePractice1(); //create object
        System.out.println(obj.d); //call instance variable via object

    }

    //main method

    public static void main(String[]args){

        System.out.println("Out put of Instance method");
        StaticInstancePractice1 obj=new StaticInstancePractice1();//create object
        obj.instance(); //call instance method in main method via object
        System.out.println("Out put of Static method");
        staticM(); //call static method in main method - direct

    }

}
