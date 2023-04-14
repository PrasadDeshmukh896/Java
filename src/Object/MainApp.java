package Object;

import java.util.Scanner;

class BookTicket{
    static int availableTicket=120;
    static double ticketCost=550.50;
    void bookTicket(int bookCount){
        if(bookCount<=availableTicket){
            availableTicket=availableTicket-bookCount;

            double totalAmt=bookCount*ticketCost;
            System.out.println("Total Amount Is "+totalAmt);
            System.out.println(bookCount+" Ticket Have Been Booked");
            showTicket();
        }else {
            System.out.println("Tickets Are Not Available");
        }

    }
    void cancelTicket(int cancelCount){
        availableTicket=availableTicket+cancelCount;

        System.out.println(cancelCount+" Tickets Have Been Canceled");
        showTicket();
    }
    void showTicket(){
        System.out.println("Available Tickets Are "+availableTicket);
    }
}
public class MainApp {
    public static void main(String[] args) {
        BookTicket b1=new BookTicket();
        Scanner sc1=new Scanner(System.in);
        System.out.println("1:Book Ticket\n2:Cancel Ticket\n3:Available Ticket");
        int choice=sc1.nextInt();

        if (choice==1){
            System.out.println("Enter Numbers Of Tickets You Want To Book");
            int count=sc1.nextInt();
            b1.bookTicket(count);
        }else if (choice==2){
            System.out.println("Enter Number Of Tickets You Want To Cancel");
            int count =sc1.nextInt();
            b1.cancelTicket(count);
        } else if (choice==3) {
            b1.showTicket();
        }else {
            System.out.println("Invalid Choice");
        }

    }
}
