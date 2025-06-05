package Second_tasks_list;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        // Vars:
        boolean again = true;
        Scanner scanner = new Scanner(System.in);
        int n;
        String dayOfTheWeek = "";
        int[] triangleSides = new int[3];
        double valorTotal = 0;
        int quantidadePrestacoes = 0;
        double jurosMensais = 0;

        // Main for exercise 1:
        do {
            again = false;
            try {
                for (int v = 0; v < triangleSides.length; v++) triangleSides[v] = scanner.nextInt();
                System.out.println(Methods.triangleType(triangleSides[0], triangleSides[1], triangleSides[2]));
            } catch (InputMismatchException | IllegalArgumentException ime_iae) {
                System.out.println(ime_iae);
                again = true;
            }
        } while (again);

        // Main for exercise 3:
        do {
            try {
                n = scanner.nextInt();
                dayOfTheWeek = Methods.weekDay((byte) n);
                System.out.println(dayOfTheWeek);
            } catch (IllegalArgumentException | InputMismatchException iaeIme) {
                System.out.println("An error occurred: " + iaeIme);
            }
            scanner.next();
        } while (!dayOfTheWeek.equals("end"));

        // Main for exercise 4:
        do {
            try {
                System.out.println("Digite o valor total: ");
                valorTotal = scanner.nextDouble();
                System.out.println("Digite a taxa de juros mensais: ");
                jurosMensais = scanner.nextDouble();
                System.out.println("Digite a quantidade de prestacoes: ");
                quantidadePrestacoes = scanner.nextInt();
                System.out.println(Methods.prestacao(valorTotal, jurosMensais, quantidadePrestacoes));
                again = false;
            } catch (IllegalArgumentException | ArithmeticException | InputMismatchException e) {
                System.out.println("An error occurred: " + e);
                again = true;
            }
        } while (again);
    }
}