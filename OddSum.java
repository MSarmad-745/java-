import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number ");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println("oddSum till " + num + " is " + sum);

    }
    public  static  int oddsum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum  += i;
            i += 2;

        }
        return  sum;
    }

}
