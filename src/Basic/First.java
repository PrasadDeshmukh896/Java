package Basic;
/*
Write a program to add 5 products variables and make sum of it and give 10% discount
and print final amount
 */
public class First {
    public static void main(String[]args){
        double p1=475.85;
        double p2=546.87;
        double p3=547.56;
        double p4=567.43;
        double p5=456.76;

        double add=p1+p2+p3+p4+p5;
        double disc=add*0.1;
        double finalAmt=add-disc;

        System.out.println("Total Amount Without Discount Is "+add);
        System.out.println("Discount Amount Is "+disc);
        System.out.println("Final Amount With Discount Is "+finalAmt);
    }
}
