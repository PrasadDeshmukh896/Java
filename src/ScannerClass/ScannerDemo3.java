package ScannerClass;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Your Full Name");
        String name=sc1.nextLine();

        System.out.println("Welcome "+name);
    }
}
