package Method;

public class MethodDemo1 {
    static void test(){
        System.out.println("Test Method");
    }
    static void display(){
        System.out.println("Display Method");
        test();
    }
    static void execute(){
        System.out.println("Execute Method");
        display();
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        execute();
        System.out.println("====================================");
        execute();
    }
}
