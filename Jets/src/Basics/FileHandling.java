package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {

        //Code to create a new file
        /*
        File myfile = new File("FileHandling.txt");
        try{
            myfile.createNewFile();
        }
        catch(Exception e){
            System.out.println("Unable to create file");
            e.printStackTrace();
        }

        //Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("FileHandling.txt");
            fileWriter.write("This is our first file from this java course\n Okay now bye");
            fileWriter.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        //Reading a file
        File myfile = new File("FileHandling");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
         */

        File myFile = new File("FileHandling.txt");
        if(myFile.delete()){
            System.out.println("File deleted successfully"+myFile.getName());
        }
        else{
            System.out.println("Something went wrong");
        }
    }
}
