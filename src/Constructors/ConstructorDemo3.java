package Constructors;

import java.util.Scanner;

class Laptop{
    String laptopName;
    int laptopRam;
    double laptopPrice;
    Laptop(String name,int ram,double price){
        laptopName=name;
        laptopRam=ram;
        laptopPrice=price;
    }
    void displayInfo(){
        System.out.println("Laptop Name: "+laptopName);
        System.out.println("Laptop Ram: "+laptopRam);
        System.out.println("Laptop Price: "+laptopPrice);
    }
}
public class ConstructorDemo3 {
    public static void main(String[]args){
        Scanner sc1=new Scanner(System.in);

        System.out.println("Enter Laptop Name");
        String name=sc1.nextLine();

        System.out.println("Enter Laptop RamSize");
        int ram=sc1.nextInt();

        System.out.println("Enter Laptop Price");
        double price=sc1.nextDouble();

        Laptop l1=new Laptop(name,ram,price);
        l1.displayInfo();

    }

}
