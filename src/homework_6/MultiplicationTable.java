package homework_6;

import java.util.Scanner; //import Scanner class

public class MultiplicationTable {

    //Instance Method

    void table(){

        int a,b,result; //Local variable
        Scanner s=new Scanner(System.in); //create object
        System.out.println("Enter the number which multiplication table you want: ");
        a=s.nextInt(); //assign the value for a at run time

      //Logic for table
        b=a*1;
        System.out.println(a+" * 1= "+b);
        b=a*2;
        System.out.println(a+" * 2= "+b);
        b=a*3;
        System.out.println(a+" * 3= "+b);
        b=a*4;
        System.out.println(a+" * 4= "+b);
        b=a*5;
        System.out.println(a+" * 5= "+b);
        b=a*6;
        System.out.println(a+" * 6= "+b);
        b=a*7;
        System.out.println(a+" * 7= "+b);
        b=a*8;
        System.out.println(a+" * 8= "+b);
        b=a*9;
        System.out.println(a+" * 9= "+b);
        b=a*10;
        System.out.println(a+" * 10= "+b);

        /*for(b=1;b<=10;b++){

            result=a*b;
            System.out.println(a+"*"+b+"="+result);

        }*/

    }

    //Main Method

    public static void main(String[]args){

        MultiplicationTable tab=new MultiplicationTable(); //create object
        tab.table(); //call instance method in main method via object

    }
}
