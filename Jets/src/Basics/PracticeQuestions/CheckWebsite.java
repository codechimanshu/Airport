package Basics.PracticeQuestions;

import java.util.Scanner;

public class CheckWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your website: ");
        String website = sc.nextLine();
        if (website.endsWith(".com")){
            System.out.println("Its a commercial website");
        }
        else if (website.endsWith(".org")) {
            System.out.println("Its a organisation website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("Its a indian website");
        }
        else {
            System.out.println("Invalid website");
        }
    }
}
