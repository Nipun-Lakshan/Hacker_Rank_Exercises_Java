import java.util.*;
import java.text.*;

class Question09 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Enter the payment amount: ");
            double payment = scanner.nextDouble();

            // US Currency Format
            NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
            String us = format.format(payment);

            // India Currency Format
            format = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));
            String india = format.format(payment);

            // China Currency Format
            format = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = format.format(payment);

            // France Currency Format
            format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france = format.format(payment);

            // Output the formatted currency values
            System.out.println("\nUS: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france + "\n");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input! Please enter a valid number.");
            return;
        }
    }
}