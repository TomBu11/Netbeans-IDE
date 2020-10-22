package daily.java;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class DailyJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter your weight (in kg)");
        double weight = scan.nextInt();
        
        System.out.println("Enter your height (in metres)");
        double height = scan.nextInt();
        
        System.out.println("Your BMI is " + (weight/(height* height)));
    }
}
