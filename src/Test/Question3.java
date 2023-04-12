package Test;

import java.util.Scanner;

/*
w.a.p to calculate area of rectangle by using parameterized method and return the value
to the main method accept length and breath from end user
 */
public class Question3 {
    static double areaOfRectangle(double length,double breath){
        double area=length*breath;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Length");
        double length=sc1.nextDouble();
        System.out.println("Enter Breath");
        double breath=sc1.nextDouble();

        double output=areaOfRectangle(length,breath);
        System.out.println("Area Of Rectangle Is "+output);
    }
}
