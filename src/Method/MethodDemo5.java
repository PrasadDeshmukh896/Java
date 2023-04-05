package Method;


/*
calculate netsalary and grosssalry
Gross Salary=Basic+HRA+Incentive
Net Salary =Basic+HRA+Incentive-Pf-Professional Tax
 */
public class MethodDemo5 {
    public static void grosssal(double basic,double hra,double incentive){
        double grossSal=basic+hra+incentive;
        System.out.println("Gross Salary Is "+grossSal);
    }
    public static void netsal(double basic,double hra,double incentive, double pf,double profTax){
        double netSal=basic+hra+incentive-pf-profTax;
        System.out.println("Net Salary Is "+netSal);
    }

    public static void main(String[] args) {
        System.out.println("Gross Salary And Net Salary");
        grosssal(10000,5000,2000);
        netsal(10000,5000,2000,3000,2000);
    }
}
