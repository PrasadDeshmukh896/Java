package Test;
/*
w.a.p to calculate product bill by accepting qty and price from end user
create external non-void method with the input parameters as qty and price and return the value to
main method after calculation
 */


import java.util.Scanner;

public class Question4 {
    static double calculateBill(double qty,double price){
        double bill=qty*price;
        return bill;
    }
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Quantity");
        double qty=sc1.nextDouble();
        System.out.println("Enter Price");
        double price=sc1.nextDouble();

        double output=calculateBill(qty,price);

        System.out.println("Total Amount Is "+output);

    }

}
