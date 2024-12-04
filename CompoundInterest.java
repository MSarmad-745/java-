import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);


 System.out.println("please enter your principle amount rate ");
int principle  = input.nextInt();
        System.out.println("Now tell the rate of intrest");
float rate = input.nextFloat();
        System.out.println("Now tell me how many years are you borrowing this money");
float years =  input.nextFloat();

    double cInterest = principle * Math.pow((1 +rate / 100),years);
        System.out.println("Your  Compound intrest RS " + cInterest);

  }
          }