package Object;


class Bike{
    //State
    String company="Yamaha R15";
    double price=168000.76;
    int fuelCapacity=12;

    //Behaviour
    void fuelEconomy(){
        System.out.println("40 Km Per Litre");
    }
    void maxSpeed(){
        System.out.println("130 Km Per Hour");
    }
}
public class Basic2 {
    public static void main(String[] args) {
        Bike b1=new Bike();
        System.out.println("Company Is "+b1.company);
        System.out.println("Price Is "+b1.price);
        System.out.println("Fuel Capacity Is "+b1.fuelCapacity);

        b1.fuelEconomy();
        b1.maxSpeed();
    }
}
