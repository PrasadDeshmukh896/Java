package Object;

class Camera{
    //State
    String brand="Sony";
    double price=45000.78;
    int storage=32;
    int batteryCapacity=5000;

    //Behaviour

    void image(){
        System.out.println("Capture Image");
    }
    void zoomInOut(){
        System.out.println("Resolution");
    }
}
public class Basic3 {
    public static void main(String[] args) {
        Camera c1=new Camera();
        System.out.println("Camera Brand Is "+c1.brand);
        System.out.println("Camera Price Is "+c1.price);
        System.out.println("Storage Capacity Of Camera Is "+c1.storage);
        System.out.println("Battery Capacity Of Camera Is "+c1.batteryCapacity);

        c1.image();
        c1.zoomInOut();
    }
}
