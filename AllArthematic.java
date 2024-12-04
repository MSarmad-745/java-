import java.util.Scanner;
public class AllArthematic {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNum = input.nextInt();
        System.out.println("Now enter the second number");
        int secondNum = input.nextInt();


        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int  multiplication = firstNum * secondNum;
        int  division = firstNum / secondNum;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
    }
}
