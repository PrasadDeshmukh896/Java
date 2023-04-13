package Test;

import java.util.Scanner;

/*
w.a.p to accept numbers from end user check weather number is divisible by 5,3 or both
and provide suitable message
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Number");
        double number = sc1.nextDouble();

        if (number % 3==0){
            if (number % 5==0){
                System.out.println("Number Is Divisible By Both");
            }else if (number % 3==0){
                System.out.println("Number Is Divisible By 3");
            }
        }else if (number % 5==0){
            System.out.println("Number Is Divisible By 5");
        }else {
            System.out.println("Number Is Not Divisible By Both");
        }

    }
}

