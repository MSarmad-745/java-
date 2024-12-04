public class Parameters {
    public static void main(String[] args) {

        System.out.println(sumTwoNumbers(4,8));
        System.out.println(sumTwoNumbers(966,45));
        System.out.println(sumTwoNumbers(4,45));
    }
    public static int sumTwoNumbers(int first, int second) {
        System.out.println("First number recieved " + first);
        System.out.println("Second number is recieved " + second );
        return first + second;
    }
}
