package Basics.PracticeQuestions;

import Basics.SwitchCase;
import java.util.Scanner;
import java.util.Random;

class Game{
    int number;
    int inputnumber;
    int noOfGusses=0;

    int NoOfGusses(){
        return noOfGusses;
    }

    Game(){
        Random r = new Random();
        number = r.nextInt(100);
    }

    void takeuserinput(){
        System.out.println("Guess the number ");
        Scanner input = new Scanner(System.in);
        inputnumber = input.nextInt();
    }

    boolean iscorrectnumber(){
        noOfGusses++;
        if (inputnumber == number){
            System.out.format("You gussed it right .The number is %d\nYou took %d Gusses",number,noOfGusses);
            return true;
        }
        else if(inputnumber < number){
            System.out.println("Too low...");
        }
        else if(inputnumber>number){
            System.out.println("Too high...");
        }
        return false;
    }
}

public class GuessTheNUM {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while (!b){
            game.takeuserinput();
            b = game.iscorrectnumber();
        }
    }
}
