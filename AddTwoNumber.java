import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number ");
        int num2 = input.nextInt();
           int Sum = num1 + num2;
        System.out.println(" The sum of your number " + Sum);
    }
}

