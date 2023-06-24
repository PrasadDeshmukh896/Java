package Constructors;
class Demo2{
    int studentId;
    String studentName;
    double studentPercentage;
    Demo2(int id, String name,double percentage){
        studentId=id;
        studentName=name;
        studentPercentage=percentage;
    }
    void displayDetails(){
        System.out.println(studentId +"\t"+studentName+"\t"+studentPercentage);
    }
}
public class ConstructorDemo2 {
    public static void main(String[]args) {
        Demo2 d2 = new Demo2(1, "Prasad", 99.87);
        d2.displayDetails();

        Demo2 d1=new Demo2(2,"Avinash",87.88);
        d1.displayDetails();
    }

}
