package Object;

import java.util.Scanner;

class Laptop{
    //State
    String companyName="Infinix";
    double price=50000.78;
    int ramSize=8;
    boolean isGraphicEnable=true;

    //Behaviour
    void runOs(){
        System.out.println("Running On Windows OS");
    }
    void displayPicturs(){
        System.out.println("Display Pictures");
    }
    void connectivity(){
        System.out.println("Connect Different Devices");
    }
}
public class Basic {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        System.out.println("Laptop Is "+l1.companyName);
        System.out.println("Price Is "+l1.price);
        System.out.println("Ram size Is "+l1.ramSize);
        System.out.println("Is Graphic Enable "+l1.isGraphicEnable);

        l1.runOs();
        l1.displayPicturs();
        l1.connectivity();

    }
}
