package Block;

public class NonStaticBlockDemo2 {
    static int count=0;
    {
       createProfile();
    }
    void createProfile(){
        System.out.println("Account Created Successfully");
        count++;
    }
    public static void main(String[]args){

        NonStaticBlockDemo2 ref=new NonStaticBlockDemo2();
        NonStaticBlockDemo2 ref2=new NonStaticBlockDemo2();
        NonStaticBlockDemo2 ref3=new NonStaticBlockDemo2();

        System.out.println("Total Number Of Account Created Is "+NonStaticBlockDemo2.count);
    }
}
