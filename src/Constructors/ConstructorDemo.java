package Constructors;

class Demo{
    int a; String name;
//    Demo(){
//        a=0; name=null;
//    }
    void test(){
        System.out.println(a+" "+name);
        System.out.println("Test Method");
    }
}
public class ConstructorDemo {
    public static void main(String[]args){
        Demo d1=new Demo();
        d1.test();
    }
}
