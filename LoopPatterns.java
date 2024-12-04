import java.util.Scanner;

public class LoopPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int rows = input.nextInt();
        firstPatterns(rows);
        secondPatterns(rows);
        thirdPatterns(rows);
    }
    public static void thirdPatterns (int maxRows){
        System.out.println("\nhere is third pattern left hand paramid :");
        int rows = maxRows;
        while (rows > 0) {
         int j = 0;
         while (j < rows - 1) {

             System.out.print("  ");
             j++;
         }
            // this loop prints stars
        int i =0;
        while (i <=  (maxRows-rows)) {
            System.out.print("* ");
        i++;
        }
            System.out.println();
        rows--;
        }
    }
    public static  void secondPatterns(int maxRows) {
        System.out.println("\nHere is second reverse right half paramid:");
        int rows = maxRows;
        while (rows > 0) {
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }

            System.out.println();
            rows--;

        }
    }
    public static void firstPatterns(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}