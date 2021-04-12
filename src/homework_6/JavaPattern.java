package homework_6;

public class JavaPattern {
   /* Write a Java program to display the following pattern.
    Sample Pattern :
    J a v v a
    J a a v v a a
    J J aaaaa V V aaaaa
    J J a a V a a */

    //Instance Method
    void pattern(){

        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a a V a a");
    }

    //Main Method
    public static void main(String[]args){

        JavaPattern obj=new JavaPattern(); //create object
        obj.pattern(); //call instance method in main method via object

    }

}
