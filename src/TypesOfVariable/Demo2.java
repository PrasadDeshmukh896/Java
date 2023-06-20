package TypesOfVariable;

public class Demo2 {
      static int a=10;
      void test(){
         int b=10;
          System.out.println(a+" "+b);
          ++a;
          ++b;
      }
    public static void main(String[] args) {
     Demo2 ref=new Demo2();
     ref.test();
     ref.test();
     ref.test();
    }
}
