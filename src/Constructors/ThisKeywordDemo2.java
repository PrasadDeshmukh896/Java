package Constructors;

class Test{
    Test(){
           System.out.println("My Name Is Prasad");
    }
    Test(int a){
        this();
        System.out.println(a);
    }

}
public class ThisKeywordDemo2 {
    public static void main(String[]args){
        Test t1=new Test(100);
    }
}
