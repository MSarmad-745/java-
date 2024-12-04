import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and heigth  of both sides in cms");

        double H = input.nextDouble();
        double B  = input.nextDouble();


        double AOT = 0.5 * B * H;

        System.out.println("Ara of triangle " + AOT);
    }
}
