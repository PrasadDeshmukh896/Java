package ScannerClass;

import java.util.Scanner;

/*
take 3 numbers from user and make addition of it
calculate average of 3 numbers
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1=sc1.nextDouble();
        System.out.println("Enter Second Number");
        double num2=sc1.nextDouble();
        System.out.println("Enter Third Number");
        double num3=sc1.nextDouble();

        double total=num1+num2+num3;
        double average=total/3;

        System.out.println("Total Is "+total);
        System.out.println("Average Is "+average);
    }
}
