package ControlStmt;

import java.util.Scanner;

/*
take 2 inputs from end user for numbers and check which number is greater

 */
public class ControlDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1=sc1.nextDouble();
        System.out.println("Enter Second Number");
        double num2=sc1.nextDouble();

        if (num1>num2){
            System.out.println(num1+" Is Greater Than "+num2);
        } else if (num2>num1) {
            System.out.println(num2+" Is Greater Than "+num1);
        }else {
            System.out.println("Both Numbers Are Equal");
        }
    }
}
