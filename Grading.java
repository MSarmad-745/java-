import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your percentage ");

        float percentage = input.nextFloat();

        if (percentage >= 90) {
            System.out.println("You got A grade ");
        } else if (percentage >= 75) {
            System.out.println("you got B grade ");
        } else if (percentage >= 60) {
            System.out.println("You got C grade ");
        } else if (percentage >= 30) {
            System.out.println("You got D grade ");
        } else {
            System.out.println("You got F and you are Fail KEEP TRYING NEED WORK HARD ");
        }
    }
}
