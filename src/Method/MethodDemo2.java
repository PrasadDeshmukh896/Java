package Method;

public class MethodDemo2 {
    static void multiply(double a, double b){//parameterized external method
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        multiply(10,20);
        multiply(20,30);
        multiply(65,87);
    }
}
