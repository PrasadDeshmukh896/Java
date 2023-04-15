package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);

        System.out.println("PrePost Incre..");
        System.out.println(a++);//10     (11)
        System.out.println(++a);//12

        System.out.println("PrePost Decr..");
        System.out.println(a--);//12     (11)
        System.out.println(--a);//10
    }
}
