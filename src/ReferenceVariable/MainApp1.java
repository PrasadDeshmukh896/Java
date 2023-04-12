package ReferenceVariable;


class Employee{
 int empId;
 String empName;

 void acceptDetails(int id,String name){
     empId=id;
     empName=name;
 }
 void displayDetails(){
     System.out.println("Employee Id Is "+empId);
     System.out.println("Employee Name Is "+empName);
 }
}
public class MainApp1 {
    public static void main(String[] args) {
       Employee e1=new Employee();
        e1.acceptDetails(101,"Prasad");
        e1.displayDetails();

        System.out.println("===================================================");

        Employee e2=new Employee();
        e2.acceptDetails(102,"Radhika");
        e2.displayDetails();

        System.out.println("===================================================");

        System.out.println(e1);
        System.out.println(e2);
    }
}
