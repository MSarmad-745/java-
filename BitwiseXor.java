import java.util.Scanner;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num = input.nextInt();
        System.out.println("Enter the second number");
       int  num1 = input.nextInt();
       int result = num^num1;

        System.out.println("Result is " + result);
    }
}
