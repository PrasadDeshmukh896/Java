package Method;
/*
calculate bill
crate 3 variable qty , price, transportation charge
apply 5% gst calculate final amount
 */
public class MethodDemo6 {
    public static void calculateBill(int qty,double price,double transCharge){

        double total=qty*price;
        double gstAmt=total+total/100*5;
        double finalAmt=gstAmt+transCharge;

        System.out.println("Total Amount Is "+total);
        System.out.println("Total Amount With GST Is "+gstAmt);
        System.out.println("Final Amount Including All Charges Is "+finalAmt);
    }

    public static void main(String[] args) {
        calculateBill(10,1500.87,250);
    }
}
