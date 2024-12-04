import java.util.Scanner;

public class FloatProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first decimal numbe");
        float num = input.nextFloat();
        System.out.println("Now enter th esecond decimal number");
        float num2 = input.nextFloat();

        float floatMul = num * num2;
        System.out.println("HERE FLOAT MULTIPLICATION " + floatMul);



    }
}
