package reading.and.writing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadingAndWriting {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("What would you like to call the text file?");
            String name = scan.nextLine();
            File newFile = new File(name + ".txt");
            
            while (true) {                
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + newFile.getName());
                    break;
                } else {
                    System.out.println("Tha file already exists try a different name");
                }
                name = scan.nextLine();
                newFile = new File(name + ".txt");
            }
            
            PrintWriter out = new PrintWriter(new FileWriter(newFile.getName()));
            
            System.out.println("What would you like to store in the file?");
            String data = scan.nextLine();
            
            out.println(data);
            
            out.close();
        } catch (Exception e) {
            System.err.println(e);
        }
        
    } 
}
