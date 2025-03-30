import java.util.Scanner;

class Question04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Ensure Scanner is closed
            System.out.print("\nEnter an Integer : ");
            int i = scanner.nextInt();
            System.out.print("Enter an Double  : ");
            double d = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer
            System.out.print("Enter a String   : ");
            String s = scanner.nextLine();

            System.out.println("String : " + s);
            System.out.println("Double : " + d);
            System.out.println("Int    : " + i);
        }
    }
}