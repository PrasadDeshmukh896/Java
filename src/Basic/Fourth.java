package Basic;
/*
-store product mrp,gst percentage,transport cost
-apply 10% dealership commission
-display final cost to dealer and user
 */
public class Fourth {
    public static void main(String[] args) {
        double productMrp=700.87;
        double gstPercentage=3;
        double transportCost=50.5;

        double gstAmt=productMrp+productMrp/gstPercentage;
        double total=gstAmt+transportCost;
        double finalAmt=total+total*0.1;

        System.out.println("Cost To Dealer "+total);
        System.out.println("Cost To User "+finalAmt);
    }
}
