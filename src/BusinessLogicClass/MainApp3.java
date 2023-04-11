package BusinessLogicClass;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Restaurant Type");
        System.out.println("1:Ac\n2:Non-Ac");
        int rType=sc1.nextInt();

        System.out.println("Select Menu Type");
        System.out.println("1:Veg\n2:Non-Veg");
        int mType=sc1.nextInt();

        System.out.println("Enter Quantity Of Dish");
        double qty=sc1.nextDouble();

       if (rType==1){
           if (mType==1){
               new HotelSimulation().vegDishAcRoom(qty);
           } else if (mType==2) {
               new HotelSimulation().nonVegAcRoom(qty);
           }else {
               System.out.println("Invalid Choice");
           }
       }else if(rType==2){
           if (mType==1){
               new HotelSimulation().vegDishNonAcRoom(qty);
           } else if (mType==2) {
               new HotelSimulation().nonVegNonAcRoom(qty);
           }else {
               System.out.println("Invalid Choice");
           }
       }else {
           System.out.println("Invalid Choice");
       }

    }
}
class HotelSimulation{
static int vegDish=1200;
static int nonVegDish=1500;
static int acRoom=50;
static int nonAcRoom=30;

void vegDishAcRoom(double qty){
   double totalBill=vegDish+acRoom*qty;
    System.out.println("Total Amount Is "+totalBill);
}
void vegDishNonAcRoom(double qty){
    double totalBill=vegDish+nonAcRoom*qty;
    System.out.println("Total Amount Is "+totalBill);
}
void nonVegAcRoom(double qty){
    double totalBill=nonVegDish+acRoom*qty;
    System.out.println("Total Amount Is "+totalBill);
}
void nonVegNonAcRoom(double qty){
    double totalBill=nonVegDish+acRoom*qty;
    System.out.println("Total Amount Is "+totalBill);
}
}
