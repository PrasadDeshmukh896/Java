package ControlStmt;

import java.util.Scanner;

/*
take input from user for quantity and price cal calculate total
if total is greater than 2000 then give 10% discount
if total is less than 2000 then give 5% discount
 */
public class ControlDemo2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Quantity");
        double qty=sc1.nextInt();
        System.out.println("Enter Price");
        double price=sc1.nextDouble();

        double total=qty*price;
        System.out.println("Total Amount Is "+total);

        if (total>2000){
            double discount=total-total/100*10;
            System.out.println("Final Amount With 10% Discount Is "+discount);
        }else {
            double discount=total-total/100*5;
            System.out.println("Final Amount With 5% Discount IS "+discount);
        }
    }


}
