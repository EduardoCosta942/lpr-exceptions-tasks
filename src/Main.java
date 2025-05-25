import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaring vars:
        int num1 = 0;
        int num2 = 0;
        double result = 0;
        boolean exceptionAtMenu;

        // Solving for vars:
        do {
            exceptionAtMenu = false;
            try {
                System.out.println("------------------------------------------------");
                System.out.println("Type the num1: ");
                num1 = scanner.nextInt();
                System.out.println("Type the num2: ");
                num2 = scanner.nextInt();
                result = (double) (num1/num2);
                System.out.println("------------------------------------------------");
                if (num1 < 0 && num2 < 0) { // Validating for Illegal Arguments at vars: num1, num2
                    System.out.println("Vars must be higher than 0");
                    exceptionAtMenu = true;
                }
            } catch (InputMismatchException ime) { // Case IME at vars: num1, num2
                System.out.println("An error occurred: " + ime);
                exceptionAtMenu = true; // Setting condition for do-while
                scanner.next(); // Cleaning buffer
            } catch (ArithmeticException ae) { // ae at var result
                System.out.println("An error occurred: " + ae);
                exceptionAtMenu = true; // Setting condition for do-while
            }
        } while (exceptionAtMenu);

        // Printing product of the vars:
        System.out.println(result);
    }
}