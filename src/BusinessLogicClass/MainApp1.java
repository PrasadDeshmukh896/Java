package BusinessLogicClass;

import java.util.Scanner;

/*
write a program to accept radius from end user and calculate area or circumference of circle
based on input provided by user
 */
public class MainApp1 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius=sc1.nextDouble();
        System.out.println("Select Mode Of Operation");
        System.out.println("1:Area Of Circle\n2:Circumference Of Circle");
        int choice=sc1.nextInt();
        if (choice==1){
            new Circle().area(radius);
        }else if (choice==2){
            new Circle().circumference(radius);
        }else {
            System.out.println("Invalid Choice");
        }
    }
}
class Circle{
    static double pi=3.14;//common accessible resource
    void area(double radius){
        double result=pi*radius*radius;
        System.out.println("Area Of Circle "+result);
    }
    void circumference(double radius){
        double result=2*pi*radius;
        System.out.println("Circumference Of Circle "+result);
    }
}
