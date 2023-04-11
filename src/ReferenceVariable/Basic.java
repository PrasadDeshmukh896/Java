package ReferenceVariable;

public class Basic {
    public static void main(String[] args) {
      Demo d1=new Demo();//First Copy
        System.out.println("J Value Is "+d1.j);
        System.out.println("K Value Is "+d1.k);
        System.out.println("=======================================");
        Demo d2=new Demo();//Second Copy
        System.out.println("J Value Is "+d2.j);
        System.out.println("K Value Is "+d2.k);
    }
}
class Demo{
    int j=20;
    int k=30;
}
