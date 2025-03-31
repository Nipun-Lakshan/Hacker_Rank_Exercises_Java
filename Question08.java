import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

class Question08 {
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public static void main(String[] args) {
        long numberOfQueries;
        try (Scanner scanner = new Scanner(System.in);) {
            while (true) {
                try {
                    // Request Number of Queries From The User
                    numberOfQueries = scanner.nextLong();
                    scanner.nextLine();
                    break;
                } catch (InputMismatchException q) {
                    System.out.println("Error : " + q);
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Error : " + e);
                    scanner.nextLine();
                }
            }
            // Array Declaration
            String numbers[] = new String[(int) (numberOfQueries)];
            // Taking Inputs
            for (int i = 0; i < numberOfQueries; i++) {
                numbers[i] = scanner.nextLine();
            }
            // Print Output
            for (int i = 0; i < numberOfQueries; i++) {
                long formattedNumber;
                if (!isValidLong(numbers[i])) {
                    System.out.println(numbers[i] + " can't be fitted anywhere.");
                } else {
                    System.out.println(numbers[i] + " can be fitted in: ");
                    formattedNumber = Long.parseLong(numbers[i]);
                    if (formattedNumber >= -128 && formattedNumber <= 127) {
                        System.out.println("* byte");
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                    } else if (formattedNumber >= -32_768 && formattedNumber <= 32_767) {
                        System.out.println("* short");
                        System.out.println("* int");
                        System.out.println("* long");
                    } else if (formattedNumber >= -2_147_483_648 && formattedNumber <= 2_147_483_647) {
                        System.out.println("* int");
                        System.out.println("* long");
                    } else if (formattedNumber >= -9_223_372_036_854_775_808L
                            && formattedNumber <= 9_223_372_036_854_775_807L) {
                        System.out.println("* long");
                    }
                }
            }
        }
    }

    public static boolean isValidLong(String input) {
        try {
            BigInteger num = new BigInteger(input);
            return num.compareTo(LONG_MIN) >= 0 && num.compareTo(LONG_MAX) <= 0;
        } catch (NumberFormatException e) {
            return false; // Non-numeric input
        }
    }
}