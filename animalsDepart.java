import java.util.Scanner;
import java.lang.*;

public class animalsDepart{
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

    public void fedAnimal(){
        System.out.println("Feed Animal");

    }

    public void cleanedCage(){
        System.out.println("Clean cage");

    }

    public void vetCheckup(){
        System.out.println("Vet checkup");

    }

    public void mainDepartChecklist(){
        fedAnimal();
        System.out.println("");
        cleanedCage();
        System.out.println("");
        vetCheckup();
    }
}