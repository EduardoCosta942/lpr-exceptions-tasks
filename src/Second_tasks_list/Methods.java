package Second_tasks_list;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Methods {
    public static String triangleType(double side1, double side2, double side3) throws InputMismatchException {
        // Validating if triangle is true:
        if (side3 + side2 < side1 || side1 + side2 < side3 || side3 + side1 < side2){
            throw new IllegalArgumentException("Those values do not create a triangle"); // Throwing "iae" exception
        }

        // Searching triangle type
        if (side3 == side2 && side2 == side1) {
            return "Equilátero";
        } else if (side3 != side2 && side2 != side1 && side3 != side1) {
            return "Escaleno";
        }
        return "Isósceles";
    }

    public static double disccount(LocalDate signUp_date, double value, int boughtsAtLastMonth) throws InputMismatchException{
        int disccount = 0;
        if (ChronoUnit.YEARS.between(LocalDate.now(), signUp_date) > 10) {
            disccount+=15;
        }
        if (value > )
    }
}