package Tasks;

import static Tasks.StaticMethods.*;

public class Executor {
    public static void main(String[] args) {
        // Task 1 - verificationDigit
        try {
            System.out.println(StaticMethods.verificationDigit("9898989898"));
        } catch (IllegalArgumentException iae) {
            System.out.println("An error occurred: " + iae);
        }

        // Task 2 - IMC
        try {
            System.out.println(imc(8, 1.77));
        } catch (IllegalArgumentException iae) {
            System.out.println("An error occurred: " + iae);
        }

    }
}
