import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PeremeterOfRecrtangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("length  of side A in cms ");
        double A = input.nextDouble();
        System.out.println("length  of side B  cms ");
        double  B = input.nextDouble();
        System.out.println("length  of side C  cms ");
        double C = input.nextDouble();
        System.out.println("length  of side D  cms ");
        double D = input.nextDouble();

        double AOR = A + B + C + D;

        System.out.println("peremeter of rectangule is " + AOR);

    }
}
