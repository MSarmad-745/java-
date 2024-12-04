import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Result " + result);
    }
}
