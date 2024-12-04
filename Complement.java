import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Complement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
      int num = input.nextInt();

      int result = ~num;
        System.out.println("Result  " + result);
    }
}
