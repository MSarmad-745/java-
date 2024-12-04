import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int Age = input.nextInt();

        if (Age >= 18){
            System.out.println("Your are eligible to drive");
        } else {
            System.out.println("Beta cycle chalao ");
        }

    }

}
