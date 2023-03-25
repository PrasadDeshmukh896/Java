package Basic;
/*
write a java program to store employee name ,basic salary,pf amount
calculate net employee salary after calculation increment basic salary by 15% and finally
display employee salary with and without increment
 */
public class Second {
    public static void main(String[] args) {
        String empName="Prasad";
        double basicSal=56000.65;
        double pfAmt=5000.65;

        double netSal=basicSal+pfAmt;
        double incrementSal=netSal+basicSal*0.15;

        System.out.println("Employee Name Is "+empName);
        System.out.println("Net Salary Is "+netSal);
        System.out.println("Salary After 15% Increment Is "+incrementSal);
    }
}
