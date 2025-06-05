package Second_tasks_list;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String dayOfTheWeek = "";
        do {
            try {
                n = scanner.nextInt();
                dayOfTheWeek = Methods.weekDay((byte) n);
                System.out.println(dayOfTheWeek);
            } catch (IllegalArgumentException | InputMismatchException iae) {
                System.out.println("An error occurred: " + iae);
            }
        } while (!dayOfTheWeek.equals("end"));
    }
}