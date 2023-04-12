package ReferenceVariable;


class Facebook{
    void appLogin(){
        System.out.println("Logged Through Application");
    }
    void webLogin(){
        System.out.println("Logged Through Website");
    }
}
public class MainApp2 {
    public static void main(String[] args) {
        Facebook f1=new Facebook();
        f1.webLogin();

        Facebook f2=f1;
        f2.appLogin();

        System.out.println(f1);
        System.out.println(f2);
        //both address will be same
    }
}
