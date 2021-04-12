package homework_6;

import java.util.Locale;

public class UppercaseToLowercase {

    //static Method

    static void uppercase(){

        String s="HELLO WORLD"; //local variable
        System.out.println("Before convert: "+s);
        System.out.println("After convert: "+ s.toLowerCase()); //convert uppercase to lower case

    }

    //Main Method

    public static void main(String[]args){

        uppercase(); //call static method in main method -direct

    }
}
