package Method;
//write a java program to convert M to KM and KM to M
public class MethodDemo7 {
    public static void mToKm(double a){
        double mToKm=a/1000;
        System.out.println(a+"m To Km Is "+mToKm);
    }
    public static void kmToM(double b){
        double kmToM=b*1000;
        System.out.println(b+"Km To m Is "+kmToM);
    }

    public static void main(String[] args) {
        mToKm(5000);
        kmToM(5.87);
    }
}
