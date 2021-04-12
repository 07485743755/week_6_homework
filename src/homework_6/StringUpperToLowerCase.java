package homework_6;

public class StringUpperToLowerCase {

    /*Write a Java program to convert a given string into lowercase.
    Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
    Output: the quick brown fox jumps over the lazy dog.*/


    String sample="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."; //Instance variable

    static void upperToLower(){

        String convert; //Local variable
        StringUpperToLowerCase st=new StringUpperToLowerCase();  //create object
        System.out.println("Before convert string is in uppercase: "+st.sample); //call instance variable and print
        convert=st.sample.toLowerCase(); //convert uppercase string to lower case string
        System.out.println("After convert the string is in lowercase:  "+convert);

    }

    //Main Method
    public static void main (String[]args){

        upperToLower(); //call static method in main method -direct

    }
}
