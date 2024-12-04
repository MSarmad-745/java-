import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your principle amount rate ");
        int principle  = input.nextInt();
        System.out.println("Now tell the rate of intrest");
        float rate = input.nextFloat();
        System.out.println("Now tell me how many years are you borrowing this money");
        float years =  input.nextFloat();

        float  Interest  = ( principle * rate * years)/100;
        System.out.println("Here is simple interest " + Interest );




    }
}
