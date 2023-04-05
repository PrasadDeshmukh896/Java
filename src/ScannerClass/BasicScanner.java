package ScannerClass;

import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc1.next();

        System.out.println("Welcome "+name);
    }


}
