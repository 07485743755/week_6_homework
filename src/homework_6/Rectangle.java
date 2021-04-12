package homework_6;

public class Rectangle {
    /* Write a Java program to print the area and perimeter of a rectangle.
    Test Data:  Width = 5.5 Height = 8.5
    Expected Output:
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20*/

    float width=5.6f;  //Instance variable
    static float height=8.5f;  //static variable

    void rectArea(){

        float area,perimeter;  //Loacal variable

        area=width*Rectangle.height; //call instance variable direct and static variable via classname
        perimeter=2*(width+Rectangle.height);

        System.out.println("Area of rectangle= "+area);
        System.out.println("Perimeter of rectangle= "+perimeter);

    }

    //Main Method

    public static void main(String[]args){

        Rectangle rect=new Rectangle(); //create object
        rect.rectArea();  //call instance method in main method via object

    }

}
