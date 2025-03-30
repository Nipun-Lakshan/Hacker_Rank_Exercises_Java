import java.util.Scanner;

class Question06 {
    public static void main(String[] args) {
        int number;
        System.out.println();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                try {
                    System.out.print("Enter an integer [2, 20] : ");
                    number = scanner.nextInt();
                    if (number >= 2 && number <= 20) {
                        System.out.println();
                        break; // Exit loop on valid input
                    }
                    else{
                        System.out.println("Please enter an integer in [2, 20] range!\n");
                    }
                } catch (Exception e) {
                    System.out.println("Error : " + e + "\n");
                    scanner.nextLine(); // Clear the invalid input from buffer
                }
            }
        }
        for(int i = 0; i < 10; i++){
            System.out.println(number + " x " + (i+1) + " = " + (number * (i+1)));
        }
    }
}