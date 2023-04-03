package Method;

public class MethodDemo3 {
    /*
    1)make addition of four values
    2)make multiplication of 3 values
    3)sub 2 vales
    4)div 2 values
     */
    static void addition(double a,double b,double c,double d){
        System.out.println(a+b+c+d);
    }
    static void multiplication(double a,double b,double c){
        System.out.println(a*b*c);
    }
    static void subtraction(double a, double b){
        System.out.println(a-b);
    }
    static void division(double a,double b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {
        addition(1,2,3,5);
        multiplication(1,2,3);
        subtraction(20,10);
        division(30,3);
    }
}
