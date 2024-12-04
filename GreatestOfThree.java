import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = input.nextInt();
        System.out.println("Now enter the second number ");
        int second = input.nextInt();
        System.out.println("Finally enter the third number");
        int third = input.nextInt();

        if (first >= second && first >= third){
            System.out.println(  first + " is greatest number  ");
        } else if (second >= first && second >= third) {
            System.out.println(second + " is greatest number");

        } else {
            System.out.println( third + " is Greatest number ");
        }
    }
}
