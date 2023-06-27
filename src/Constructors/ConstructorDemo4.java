package Constructors;

class Master{
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("NonStatic Block");
    }
    Master(){
        System.out.println("Constructor");
    }
    void Info(){
        System.out.println("Info Method");
    }
}
public class ConstructorDemo4 {
    public static void main(String[]args){
        Master m1=new Master();
        m1.Info();
    }
}
