package Block;


class Test{
    static {
        System.out.println("First Static Block Of Test");
    }
    static{
        System.out.println("Second Static Block Of Test");
    }
}
public class StaticBlockDemo4 {
    static{
        System.out.println("Static Block Of Main Class");
    }
    public static void main(String[]args){
        System.out.println("Main Method");
        Test ref=new Test();
    }
}
