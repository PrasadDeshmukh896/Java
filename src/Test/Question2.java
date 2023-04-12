package Test;
/*
w.a.p. to create external method which accept three parameters.perform addition of all value and return
the value to the main method
 */
public class Question2 {
    static double addition(double num1,double num2,double num3){
        double total=num1+num2+num3;
        return total;
    }

    public static void main(String[] args) {
        double output=addition(54.87,73.76,67.86);
        System.out.println("The Addition Is "+output);
    }
}
