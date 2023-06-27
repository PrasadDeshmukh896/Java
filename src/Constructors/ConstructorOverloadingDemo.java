package Constructors;

class Registration {
    String userName;
    long contact;
    String email;
    String address;

    Registration(String name, long contactNo, String emailId) {
        userName=name;
        contact=contactNo;
        email=emailId;
    }
    Registration(String name,long contactNo,String emailId,String currentAddress){
        userName=name;
        contact=contactNo;
        email=emailId;
        address=currentAddress;
    }
    void displayInfo(){
        System.out.println(userName);
        System.out.println(contact);
        System.out.println(email);
        System.out.println(address);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[]args){
        Registration r1=new Registration("Prasad", 9158359231L,"prasaddeshmukh896@gmail.com");
        r1.displayInfo();
System.out.println("===========================================");
        Registration r2=new Registration("Suresh",9307153806L,"pachpawarprasad@gmail.com","Pune");
        r2.displayInfo();

    }
}

