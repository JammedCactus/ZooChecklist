import java.util.Scanner;
import java.lang.*;

public class shopsDepart{
    Scanner userInput = new Scanner(System.in);

    public void section(){
        System.out.println("What section of the park are you in? ");
        String section = userInput.nextLine(); 

        if(section.equals("entrance")){
            shopsDepartChecklist();

        }
        else if(section.equals("admin")){
            shopsDepartChecklist();

        }
        else if(section.equals("giftshop")) {
            shopsDepartChecklist();

        }
        else {
            System.out.println("Not a vaild section");
        }
    }

    public void registerCheck(){
        System.out.println("Make sure cashbox is full");

    }

    public void printMap(){
        System.out.println("Print maps");

    }

    public void mapCheck(){
        System.out.println("Make sure all map spots are full");

    }

    public void orderTicket(){
        System.out.println("Order a new ticket");

    }

    public void printTicket(){
        System.out.println("Print ticket");

    }

    public void shopsDepartChecklist(){
        registerCheck();
        System.out.println("");
        mapCheck();
        System.out.println("");
        printMap();
        System.out.println("");
        orderTicket();
        System.out.println("");
        printTicket();
    }
}