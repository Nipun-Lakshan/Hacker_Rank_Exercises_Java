import java.util.Scanner;

class Question02 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int n;

            while (true) {
                System.out.print("Input an integer between 1 to 100 :- ");
                n = input.nextInt();

                if (n >= 1 && n <= 100) {
                    break; // Exit loop if input is valid
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 100!");
                }
            }

            if (n % 2 != 0) {
                System.out.println("Weird");
            } else {
                if (n >= 2 && n <= 5) {
                    System.out.println("Not Weird");
                } else if (n >= 6 && n <= 20) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        }
    }
}
