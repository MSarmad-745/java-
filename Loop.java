import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
         int num = 1; //initialize
        while (num <= 1000) {//condition
            System.out.println(num);
            num = num + 1; //updating the condition


        }

        int count = 500;
        while (count >= 200)
        {
            System.out.println(count);
            count = count - 1;

        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5){
            int inp = input.nextInt();
            System.out.println("Number is " + inp);
            i = i + 1;
        }
    }
}
