import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The value of a ");
        int  a = input.nextInt();
        System.out.println("The value of b ");
        int b = input.nextInt();

         a = a + b; //update a
         b = a - b; //value of b
        a = a - b;//value of a


        System.out.println("AFTER SWAPE ");
        System.out.println("The value of a " + a);
        System.out.println("The value of b " + b);

    }
}
