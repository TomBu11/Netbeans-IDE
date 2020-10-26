package daily.java;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class DailyJava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ndd;
        
        System.out.println("Enter a number");
        int n = scan.nextInt();
        
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }
}
