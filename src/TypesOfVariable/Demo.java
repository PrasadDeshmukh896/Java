package TypesOfVariable;

class Demo{
       static int b=20; // class variable
       int c=30; //  instance variable
    public static void main(String[] args) {
        Demo ref=new Demo();
        int a=10; // local variable
        System.out.println(a);
        System.out.println(Demo.b);
        System.out.println(ref.c);
    }
}