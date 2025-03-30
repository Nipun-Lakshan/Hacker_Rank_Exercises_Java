
/* Import Libraries */
import java.util.Scanner;

/* Class */
class Question05 {
    /* Main Method */
    public static void main(String[] args) {
        // Constant
        final int MAX_LENGTH_OF_STRING = 15;
        // Scanner with Correct Closing
        try (Scanner scanner = new Scanner(System.in)) {
            // Arrays Declarations
            String strings[] = new String[3];
            int numbers[] = new int[3];
            System.out.println();
            // Requesting Inputs
            for (int k = 0; k < 3; k++) {
                System.out.print("Line 0" + (k+1) + " :- ");
                strings[k] = scanner.next();
                numbers[k] = scanner.nextInt();
            }
            // Printing Output
            System.out.println("\n================================");
            for (int j = 0; j < 3; j++) {
                int length = strings[j].length();
                System.out.print(strings[j]);
                for (int i = 0; i < (MAX_LENGTH_OF_STRING - length); i++) {
                    System.out.print(" ");
                }
                if (numbers[j] >= 0 && numbers[j] <= 9) {
                    System.out.print("00" + numbers[j]);
                } else if (numbers[j] >= 10 && numbers[j] <= 99) {
                    System.out.print("0" + numbers[j]);
                } else {
                    System.out.print(numbers[j]);
                }
                System.out.println("");
            }
            System.out.println("================================");
        }

    }
}