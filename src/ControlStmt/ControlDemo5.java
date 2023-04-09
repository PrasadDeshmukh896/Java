package ControlStmt;

import java.util.Scanner;

public class ControlDemo5 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age=sc1.nextInt();

        if (age>=18){
            System.out.println("You Are Eligible For Voting");
        }else {
            System.out.println("You Are Not Eligible For Voting\nGo And Watch Pogo");
        }
    }
}
