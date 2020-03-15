import java.util.Scanner;
import java.lang.*;

public class mainDepart{
    Scanner userInput = new Scanner(System.in);

    public void section(){
        System.out.println("What section of the park are you in? ");
        String section = userInput.nextLine(); 

        if(section.equals("paws on")){
            mainDepartChecklist();

        }
        else if(section.equals("entrance")){
            mainDepartChecklist();

        }
        else if(section.equals("africa")) {
            mainDepartChecklist();

        }
        else if(section.equals("asia")) {
            mainDepartChecklist();

        }
        else if(section.equals("cafe")) {
            mainDepartChecklist();

        }
        else if(section.equals("florida")) {
            mainDepartChecklist();

        }
        else if(section.equals("rainforest")) {
            mainDepartChecklist();

        }
        else {
            System.out.println("Not a vaild section");
        }
    }

    public void trashCleaned(){
        System.out.println("Empty trash cans");

    }

    public void walkComplete(){
        System.out.println("Complete walk and pick up trash");

    }

    public void dispensersChecked(){
        System.out.println("Check and refill animal food dispensers if needed");

    }

    public void gatesLocked(){
        System.out.println("Make sure all gates are locked");

    }

    public void mainDepartChecklist(){
        trashCleaned();
        System.out.println("");
        walkComplete();
        System.out.println("");
        dispensersChecked();
        System.out.println("");
        gatesLocked();
        System.out.println("");
    }
}