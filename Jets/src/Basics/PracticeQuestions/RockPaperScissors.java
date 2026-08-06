package Basics.PracticeQuestions;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        System.out.println("--|ROCK PAPER SCISSORS GAME|-- \n 1.ROCK \n 2.PAPER \n 3.SCISSORS ");

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int c =r.nextInt(1,4);
        System.out.print("choose your choice :");
        int choice = sc.nextInt();

        if (c==1){
            switch (choice){
                case 1 -> System.out.println("Match Draw");
                case 2 -> System.out.println("You Win");
                case 3 -> System.out.println("You Lose");
                default -> System.out.println("Wrong choice");
            }
        }

        else if (c==2){
            switch (choice){
                case 1 -> System.out.println("You Lose");
                case 2 -> System.out.println("Match Draw");
                case 3 -> System.out.println("You Win");
                default -> System.out.println("Wrong choice");
            }
        }

        else{
            switch (choice){
            case 1 -> System.out.println("You Win");
            case 2 -> System.out.println("You Lose");
            case 3 -> System.out.println("Match Draw");
            default -> System.out.println("Wrong choice");
            }
        }

        System.out.println("the computer choice is " + c);
        System.out.println();

    }
}
