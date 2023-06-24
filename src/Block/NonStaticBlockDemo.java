package Block;

public class NonStaticBlockDemo {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Non Static Block");
    }
    public static void main(String[]args){
        System.out.println("Main Method");
        NonStaticBlockDemo ref=new NonStaticBlockDemo();
        NonStaticBlockDemo ref2=new NonStaticBlockDemo();
    }
}
