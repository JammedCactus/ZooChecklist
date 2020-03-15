import java.util.Scanner;
import java.lang.*;

class ZooCheckerRedo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //String exit = "done";

        System.out.println("What department? ");
        String depart = input.nextLine();

        if(depart.equals("main")){
            mainDepart main = new mainDepart(); 
            main.section();
        }
        else if(depart.equals("activities")){
            actDepart act = new actDepart();
            act.section();
        }
        else if(depart.equals("shops")){
            shopsDepart shop = new shopsDepart();
            shop.section();
        }
        else if(depart.equals("animals")){
            animalsDepart animal = new animalsDepart();
            animal.section();
        }
        else{
            System.out.println("Not a vaild department");
        }

    }
}