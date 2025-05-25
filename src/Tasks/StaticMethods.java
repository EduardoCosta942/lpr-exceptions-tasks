package Tasks;

public class StaticMethods {
    public static String verificationDigit(String stringOfNumbers) {
        // Declaring vars:
        int sum = 0;

        if (stringOfNumbers.length() != 10) {
            throw new IllegalArgumentException("Var: stringOfNumbers must have exactly 10 characters"); // Throwing IllegalArgumentException
        }
        // Solving for sum:
        for (char character : stringOfNumbers.toCharArray()) { // Integrating at var: stringOfNumbers
            if (!"0123456789".contains(String.valueOf(character))) {
                throw new IllegalArgumentException("Var: stringOfNumbers must have only integer numbers"); // Throwing IllegalArgumentException 2
            }
            sum += character - '0';
        }
        return String.valueOf(sum / 10); // verificationDigit
    }

    public static String  imc(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException ("Vars must be higher than 0");
        }
        return imc(weight / (height * height));
    }
    public static String imc(double imc) {
        if (imc <= 0) {
            throw new IllegalArgumentException ("Var must be higher than 0");
        }
        if (imc < 18.5) {
            return "Voce esta abaixo do peso ideal";
        }
        if (imc <= 24.99) {
            return "Parabens! - Voce esta em seu peso ideal";
        }
        if (imc <= 34.99) {
            return "Obesidde grau 1";
        }
        if (imc <= 39.99) {
            return "Obesidade grau 2";
        }
        return "Obesidade grau 3";
    }
}
