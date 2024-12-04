import java.util.Scanner;

public class isAmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = input.nextInt();
        boolean isAmstrong = isAmstrongNum(number);
        if (isAmstrong) {

            System.out.println("Your number  is Armstrong");
        } else {
            System.out.println("Your number is not a Armstrong");
        }
    }
    public static boolean isAmstrongNum(int num){
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        System.out.println("no of digits " + noOfDigits);
        int finalNumber = 0;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return  finalNumber == numCopy;
    }
    public static int pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }

        return  result;
    }

    public static int noOfDigits (int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }

}
