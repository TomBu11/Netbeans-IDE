package ioexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOExercise {
    public static void main(String[] args) {
        String questions = "";
        try {
            Scanner scan = new Scanner(new File("questions.txt"));
            while (scan.hasNextLine()) {
                questions = questions + " " + scan.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()); 
        }
        
        String[] question = questions.split(" ");
        String[] answer = {"Paris", "Berlin", "Madrid", "Tom", "Red", "about 24 miles per hour"};

        int score = 0;
        Scanner scan = new Scanner(System.in);
        String input;

        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            input = scan.nextLine();
            if (input.equals("Is it an African swallow or a European swallow?")) {
                System.out.println("A European swallow");
                input = scan.nextLine();
            }
            if (input.equals(answer[i])) {
                System.out.println("Correct!");
                score++;
            } else{
                System.out.println("Wrong, the correct answer was " + answer[i]);
            }
        }

        System.out.println("You scored " + score + " out of " + question.length);
    }
}
