package ControlStmt;

import java.util.Scanner;

/*
take input from user and check number is odd or even
 */
public class ControlDemo1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc1.nextInt();

        if (num%2==0){
            System.out.println(num+" Is Even Number");
        }else {
            System.out.println(num+" Is Odd Number");
        }
    }
}
