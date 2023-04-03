package Basic;
/*
swap two numbers with and without using third variable
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;

        //With Using Third Variable
        System.out.println("Numbers Before Swapping"+" Num1:"+num1+" Num2:"+num2);

        int temp=num1;
     num1=num2;
     num2=temp;

        System.out.println("Numbers After Swapping"+" Num1:"+num1+" Num2:"+num2);

        //Without Using Third Variable
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("Numbers After Swapping"+"Num1:"+num1+" Num2:"+num2);
    }
}
