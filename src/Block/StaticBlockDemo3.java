package Block;

public class StaticBlockDemo3 {
    static int a=10;
    static int b=20;
    static {
        a=30;
        System.out.println(a+b);
    }
    static {
        b=50;
        System.out.println(a+b);
    }
    public static void main(String[]args){
        System.out.println("Main Method");
    }
}
