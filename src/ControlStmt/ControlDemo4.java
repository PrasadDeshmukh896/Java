package ControlStmt;

import java.util.Scanner;

public class ControlDemo4 {

    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("1:Hr\n2:Manager");
        int choice=sc1.nextInt();
        System.out.println("Enter Salary");
        double salary=sc1.nextDouble();


        if (choice==1){
           getHrSalary(salary);
        }else if(choice==2){
           getManagerSalary(salary);
        }else {
            System.out.println("Invalid Choice");
        }
    }
    static void getHrSalary(double salary){
        double updatedSal=salary+salary/100*20;
        System.out.println("Original Salary for Hr Is "+salary);
        System.out.println("Incremental Salary For Manager Is "+updatedSal);
    }
    static void getManagerSalary(double salary){
        double updatedSal=salary+salary/100*30;
        System.out.println("Original Salary For Manger Is "+salary);
        System.out.println("Incremental Salary For Manager Is "+updatedSal);
    }
}
