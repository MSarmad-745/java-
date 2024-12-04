public class Functions {
    public static void main(String[] args) {
  //      System.out.println("In main method ");
    //      greeting();
      //  System.out.println("Method calling completed");
        // greeting();
        //System.out.println("Patterns");
        firstPattern();
        //firstPattern();
        //System.out.println("BEST");
        //secondPattern();
        //System.out.println("WISHES");
       // thirdPattern();
        
    }
    public static void thirdPattern(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");

    }
    public static void secondPattern(){
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

    }
    public static void firstPattern(){


        int rows =  0;
        while (rows < 5 ){
            System.out.print("*");
            int i = 0;
            while (i < rows ){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }


     public  static void greeting() {
         System.out.println("GOOD MORNING FROM MSD ");

     }
}
