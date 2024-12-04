import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age ");

        int Age = input.nextInt();

        if (Age <= 13 ){
            System.out.println("Your are  in child age ");
        } else if (Age <= 20) {
            System.out.println(" you are in teen age ");
        } else if (Age <= 60 ) {
            System.out.println("your are in adult age ");
        } else {
            System.out.println("Your are senior");
        }
    }
}
