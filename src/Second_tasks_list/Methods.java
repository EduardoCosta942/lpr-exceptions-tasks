package Second_tasks_list;
//import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class Methods {
    public static String triangleType(double side1, double side2, double side3) throws IllegalArgumentException {
        // Validations:
        if (side3 + side2 < side1 || side1 + side2 < side3 || side3 + side1 < side2){
            throw new IllegalArgumentException("There is no triangle"); // Throwing iae exception if triangle is not true;
        } else if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalArgumentException("Values under 0"); // Throwing iae exception if values under 0
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
        if (value > 1500) {
            disccount+=17;
        }
        if (boughtsAtLastMonth > 5) {
            disccount+=13;
        }
        return disccount;
    }

    public static String weekDay(byte targetDay) throws IllegalArgumentException{
        // Declaring vars:
        String[] daysOfTheWeek = {
                "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"
        };


        if (targetDay == 0) return "end"; // Ending program
        if (targetDay < 1 || targetDay > 7) throw new IllegalArgumentException("Parameter must be in range (1 to 7)"); // Throwing IAE according to condition

        return daysOfTheWeek[targetDay - 1]; // If there is no IAE, returning the correct String.
    }

    public static double prestacao(double value, double jurosMensais, int numerosParcelas) throws ArithmeticException, IllegalArgumentException{
        if (value <= 0 || jurosMensais <= 0 || numerosParcelas <= 0) throw new IllegalArgumentException("Parameters can not be under 0.");
        jurosMensais/=100;
        value*= Math.pow((1+jurosMensais), numerosParcelas);
        if (value/numerosParcelas < 50){ throw new  IllegalArgumentException("Parcelas insuficientes");}
        return value/numerosParcelas;
    }
}