package Method;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Internal Method ");
        external();
    }
    public static void external(){
        System.out.println("External Method");
    }
}
