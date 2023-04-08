package BusinessLogicClass;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("J Value Is "+new Demo2().j);
        new Demo2().info();
    }
}
class Demo2{
    int j=20;
    void info(){
        System.out.println("Test Method");
    }
}
