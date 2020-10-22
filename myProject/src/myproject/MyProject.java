package myproject;

import java.util.Scanner;

public class MyProject {

    static void myMethod() {
        Scanner scan = new Scanner(System.in);
        double num = Math.random() * 100;
        int count = 1;
        int guess = 50;
        int high = 100;
        int low = 0;
        String if1 = "es";
        String input = "";
        boolean isCorrect = false;

        do {
            System.out.println("Is the number " + guess + "?");
            input = (scan.nextLine()).toLowerCase();
            if (input.equals("yes")) {
                isCorrect = true;
                System.out.println("Get in!!!");
                if (count == 1) { //this is so that if the answer is 50 then it doesn't say "it only took me 1 guesses"
                    if1 = "";
                }
                System.out.println("And it only took me " + count + " guess" + if1); //Tells you how many guesses it took
            } else if (input.equals("higher")) {
                low = guess;
                guess = low + (int) (high - low) / 2;
            } else if (input.equals("lower")) {
                high = guess;
                guess = high + (int) (low - high) / 2;
            } else {
                System.out.println("You need to answer higher, lower or yes");
            }
            count++;
        } while (!isCorrect);
    }
    public static void main(String[] args) {
        myMethod();
    }
}
