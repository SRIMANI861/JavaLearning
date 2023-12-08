package Challenge;

import java.util.Scanner;

public class StudentChallengeRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the length of the rectangle: " + " ");
        int length = s.nextInt();
        System.out.println("enter the breadth of the rectangle:" + " ");
        int breadth = s.nextInt();

        System.out.println(Rectangle.area(length, breadth));
        System.out.println(Rectangle.perimeter(length, breadth));
        if (Rectangle.isSquare(length, breadth)){
            System.out.println("it is a square");
        }
        else {
            System.out.println("it is not a square");
        }



    }

}
class Rectangle{
    public static int area(int length,int breadth){
        return length*breadth;
    }
    public static int perimeter(int length,int breadth){
        return 2*(length+breadth);
    }

    public static boolean isSquare(int length,int breadth){
        if (length == breadth){
            return true;
        }
        return false;

    }
}

