package Method;
/*
1)create two non-void method for multiplication and areaOfCircle
2)in multiplication return multiplication and  pass 2 parameters in multiplication method
3)in area of circle return areaofcircle and call multiplication() and  pass 2 new parameters in multiplication method
calculate area of circle by making use of output of multiplication method
3)in main method call area of circle and pass 2 arguments
 */
public class MethodDemo10 {
    static double multiplication(double a,double b){
        double total=a*b;
        return total;
    }
    static double areaOfCircle(double num1,double num2){
        double output=multiplication(num1,num2);
         double area=3.14*output*output;
         return area;
    }
    public static void main(String[] args) {
     double result=areaOfCircle(10,4);
        System.out.println("Area Of Circle Is "+result);
    }
}
