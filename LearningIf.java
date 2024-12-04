import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LearningIf {
    public static void main(String[] args) {


        boolean isMale = false;
        String name = "Bob";
        if (isMale) {
            System.out.println("Mr" + name);
        } else {
            System.out.println("Ms " + name);
        }
            boolean isSeniorCitizen = false;
            boolean isAdult = false;

            if (isSeniorCitizen) {
                System.out.println("HELLO SENIOR CITIZEN");
            } else if (isAdult) {
                System.out.println("HELLO ADULT");
            } else {
                System.out.println("HELLO CHILD ");
            }

        }
    }

