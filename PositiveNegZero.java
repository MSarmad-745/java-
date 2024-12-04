import java.util.Scanner;

public class PositiveNegZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();

        if (num > 0 ){
            System.out.println("Your number is positive");
        } else if (num == 0) {
            System.out.println("Your number is zero ");
        } else {
            System.out.println("your number is negative ");
        }
    }
}

