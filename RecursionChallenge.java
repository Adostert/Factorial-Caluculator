package co.grandcircus;
import java.util.Scanner;
public class RecursionChallenge {
    public static void main(String[] args) {
        String yesno = "yes";
        Scanner scan = new Scanner(System.in);
        while (yesno != "no") {
            System.out.println("Please enter a number: ");
            int userNum = scan.nextInt();
            System.out.println(userNum + " is " + factorial(userNum));
        }
        System.out.println("Continue? y/n: ");
        yesno = scan.next();
    }
    public static long factorial(int num) {
        long result = 1;
        for (int factor = 2; factor <= num; factor++) {
            result *= factor;
        }
        return result;
    }
}