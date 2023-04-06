package ScannerClass;

import java.util.Scanner;

/*
perform arithmetic operation
create separate non-void method for operations
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1=sc1.nextDouble();
        System.out.println("Enter Second Number");
        double num2=sc1.nextDouble();

        double output1=addition(num1,num2);
        double output2=multiplication(num1,num2);
        double output3=division(num1,num2);
        double output4=subtraction(num1,num2);

        System.out.println("Addition Is "+output1);
        System.out.println("Multiplication Is "+output2);
        System.out.println("Division Is "+output3);
        System.out.println("Subtraction Is "+output4);
    }
    static double addition(double a,double b){
        double total=a+b;
        return total;
    }
    static double multiplication(double a,double b){
        double total=a*b;
        return total;
    }
    static double division(double a,double b){
        double total=b/a;
        return total;
    }
    static double subtraction(double a,double b){
        double total=b-a;
        return total;
    }
}
