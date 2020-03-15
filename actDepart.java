import java.util.Scanner;
import java.lang.*;

public class actDepart{
    Scanner userInput = new Scanner(System.in);

    public void section(){
        System.out.println("What program are you working? ");
        String section = userInput.nextLine(); 

        if(section.equals("zipline")){
            actDepartChecklist();

        }
        else if(section.equals("kids")){
            actDepartChecklist();

        }
        else if(section.equals("group")) {
            actDepartChecklist();

        }
        else if(section.equals("kayaking")) {
            actDepartChecklist();

        }
        else if(section.equals("train")) {
            trainChecklist();

        }
        else if(section.equals("florida")) {
            actDepartChecklist();

        }
        else if(section.equals("rainforest")) {
            actDepartChecklist();

        }
        else {
            System.out.println("Not a vaild section");
        }

    }

    public void supplyCheck(){
        System.out.println("Check supplies");
    }

    public void loadProgram(){
        System.out.println("Open program");
    }

    public void loadMap(){
        System.out.println("Open map");
    }

    public void checkTrainRepairs(){
        System.out.println("Check for train repairs");
    }

    public void runTrain(){
        System.out.println("Start the train");
    }

    public void checkMoney(){
        System.out.println("Check cashbox");
    }

    public void actDepartChecklist(){
        supplyCheck();
        loadProgram();
        loadMap();
        checkMoney();
    }
    public void trainChecklist(){
            supplyCheck();
            loadProgram();
            loadMap();
            checkTrainRepairs();
            runTrain();
            checkMoney();
    }


}