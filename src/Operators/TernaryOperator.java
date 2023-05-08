package Operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        double number =sc1.nextDouble();

        String result=(number%2==0)?"Even":"Odd";

        System.out.println("Given Number Is "+result+" Number");

    }
}
