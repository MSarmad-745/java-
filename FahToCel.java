import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your temp in F ");
        float fh = input.nextFloat();
        float  cel =  (fh - 32) * 5/9;

        System.out.println("your temperature is: " + cel + "C");





    }
}
