package Block;

import java.util.Scanner;

public class AtmSimulator {
    static Scanner sc1=new Scanner(System.in);
    static double accountBal=5000.0;
     static int pin;

     static {
         System.out.println("Select Language");
         System.out.println("1:English\n2:Marathi");
         int choice=sc1.nextInt();

         if (choice==1){
             System.out.println("Selected Language Is English");
         }else if(choice==2){
             System.out.println("Selected Language Is Marathi");
         }else {
             System.out.println("Invalid Choice");
             System.exit(0);
         }

     }
     static{
         System.out.println("Please Enter Pin");
         pin=sc1.nextInt();
     }
     public static void main(String[]args){
         if(pin==1234){
             System.out.println("1:Withdraw\n2:Check Balance\n3:Change Pin");
             int choice=sc1.nextInt();

             if (choice==1){
                 System.out.println("Enter Amount");
                 double withdrawAmt=sc1.nextDouble();
                 withdraw(withdrawAmt);
             } else if (choice==2) {
                 checkBalance();
             } else if (choice==3) {
                 System.out.println("Enter New Pin");
                 int newPin= sc1.nextInt();
                 changePin(newPin);
             }else {
                 System.out.println("Invalid Choice");
             }

         }else{
             System.out.println("Incorrect Pin");
             System.exit(0);
         }
     }
     static void withdraw(double withdrawAmt){
         if (withdrawAmt<=accountBal){
             accountBal=accountBal-withdrawAmt;
             System.out.println(withdrawAmt+" Amount Withdrawal Successfully");
             System.out.println("Account Balance Is "+accountBal);
         }else {
             System.out.println("Insufficient Balance");
         }
     }
     static void checkBalance(){
         System.out.println("Account Balance Is "+accountBal);
     }
     static void changePin(int newPin){
         if (newPin==pin){
             System.out.println("Pin Already In Use Please Enter New Pin");
         }else {
             pin=newPin;
             System.out.println("Pin Changed Successfully");
         }
     }
}
