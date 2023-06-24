package Block;

public class StaticBlockDemo2 {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static{
        System.out.println("Static Block First");
    }
    static {
        System.out.println("Static Block Second");
    }
    static{
        System.out.println("Static Block Third");
    }
}
