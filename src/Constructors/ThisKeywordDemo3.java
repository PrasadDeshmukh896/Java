package Constructors;

class Sample{
    Sample(){
        this(100);
    }
    Sample(int a){
        System.out.println(a);
    }
}
public class ThisKeywordDemo3 {
public static void main(String[]args){
    Sample s1=new Sample();
}
}
