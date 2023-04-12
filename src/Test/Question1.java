package Test;
/*
w.a.p to declare 5 variable of type double calculate average value and make square of that value
display average value as well as square value
 */
public class Question1 {
    public static void main(String[] args) {
        double num1=20.5;
        double num2=21.5;
        double num3=22.5;
        double num4=23.5;
        double num5=25.5;

        double total=num1+num2+num3+num4+num5;
        double average=total/5;
        double square=average*average;

        System.out.println("Average Is "+average);
        System.out.println("Square Is "+square);
    }
}
