import java.util.Scanner;

public class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Your number is odd");
        }else  {
            System.out.println("your number is even");
        }
    }
}
