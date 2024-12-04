public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(y);

        int a = 8;
        a = a + 1;
        System.out.println(a);
        a += 1;

        System.out.println("WATCHING  INCREMENT ");
        int  p = 5;
        System.out.println(p++);
        System.out.println(p);
        System.out.println(++p);
        System.out.println(p);

        System.out.println("WATCHING DECREMENT");

        int r = 8;
        System.out.println(r--);
        System.out.println(r);

        System.out.println(--r);
        System.out.println(r);



    }
}
