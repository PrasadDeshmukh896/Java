package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a=10;// assignment
        int b=20;// assignment

        System.out.println("Addition And Assignment "+(a+=b));// a=a+b
        System.out.println("Subtraction And Assignment "+ (a-=b));// a=a-b
        System.out.println("Multiplication And Assignment "+ (a*=b));// a=a*b
        System.out.println("Division And Assignment "+ (a/=b)); //a=a/b
        System.out.println("Modulo And Assignment "+(b%=a));// b=b%a
    }
}
