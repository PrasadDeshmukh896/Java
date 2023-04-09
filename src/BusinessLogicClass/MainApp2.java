package BusinessLogicClass;

import java.util.Scanner;

/*
w.a.p to calculate electricity bill based on type of user
provide option to end user in order to select appropriate customer type
accept current reading and previous readings from end user
residentialUnitRate=4.25
commercialUnitRate=5.25
 */
class Electricity{
static double residentialUnit=4.25;
static double commercialUnit=5.25;
void residentialBill(double previous,double current){
    double totalUnit=current-previous;
    double billAmt=totalUnit*residentialUnit;
    System.out.println("Total Bill Amount For Residential Customer Type Is "+billAmt);
}
void commercialBill(double previous,double current){
    double totalUnit=current-previous;
    double billAmt=totalUnit*commercialUnit;
    System.out.println("Total Bill Amount For Commercial Customer Type Is "+billAmt);
}
}
public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Current Reading");
        double current=sc1.nextDouble();
        System.out.println("Enter Previous Reading");
        double previous=sc1.nextDouble();

        System.out.println("Select Customer Type");
        System.out.println("1:Residential\n2:Commercial");
        int choice=sc1.nextInt();

        if (choice==1){
            new Electricity().residentialBill(previous,current);
        }else if (choice==2){
            new Electricity().commercialBill(previous,current);
        }else {
            System.out.println("Invalid Choice");
        }
    }
}
