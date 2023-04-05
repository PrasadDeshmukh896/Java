package Method;
/*
declare one void and one non-void method
in non-void method make addition and return
in void method make square of addition that we calculated in void method
 */
public class MethodDemo9 {
    static double addition(double a,double b){
        double total=a+b;
        System.out.println("The Addition Is "+total);
        return total;
    }
    static void square(){
        double output= addition(15,5);
        double sq=output*output;
        System.out.println("The Square Is "+sq);
    }

    public static void main(String[] args) {
        square();
    }
}
