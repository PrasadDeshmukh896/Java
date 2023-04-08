package BusinessLogicClass;

public class Basic1 {//executable class
    public static void main(String[] args) {
        System.out.println("K Value Is "+Demo.k);
        Demo.test();
    }
}
class Demo{//business logic class
    static int k=10;//data member
    static void test(){
    //function member
        System.out.println("Test Method");
    }
}
