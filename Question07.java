import java.util.InputMismatchException;
import java.util.NoSuchElementException; // Imports
import java.util.Scanner;

class Question07 { // Class
    public static void main(String[] args) { // Main Method
        // Variables
        int q;
        // Scanner Function
        try (Scanner scanner = new Scanner(System.in)) {
            // Request number of queries from user
            while (true) {
                try {
                    System.out.print("Number of Queries : ");
                    q = scanner.nextInt();
                    if (q >= 0 && q <= 500) {
                        break;
                    }
                } catch (InputMismatchException p) {
                    System.out.println("Error : " + p);
                } catch (NoSuchElementException z) {
                    System.out.println("Error : " + z);
                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }
            }
            // Arrays Declarations
            int array_a[] = new int[q];
            int array_b[] = new int[q];
            int array_n[] = new int[q];
            // Taking Values For Queries
            for (int i = 0; i < q; i++) {
                // Taking Input For a in One Line
                while (true) {
                    try {
                        System.out.print("Query " + (i+1) + ": - ");
                        array_a[i] = scanner.nextInt();
                        if (array_a[i] >= 0 && array_a[i] <= 50) {
                            break;
                        }
                    } catch (InputMismatchException p) {
                        System.out.println("Error : " + p);
                    } catch (NoSuchElementException z) {
                        System.out.println("Error : " + z);
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }
                }
                // Taking Input For b in One Line
                while (true) {
                    try {
                        array_b[i] = scanner.nextInt();
                        if (array_b[i] >= 0 && array_b[i] <= 50) {
                            break;
                        }
                    } catch (InputMismatchException p) {
                        System.out.println("Error : " + p);
                    } catch (NoSuchElementException z) {
                        System.out.println("Error : " + z);
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }
                }
                // Taking Input For n in One Line
                while (true) {
                    try {
                        array_n[i] = scanner.nextInt();
                        if (array_n[i] >= 1 && array_n[i] <= 15) {
                            break;
                        }
                    } catch (InputMismatchException p) {
                        System.out.println("Error : " + p);
                    } catch (NoSuchElementException z) {
                        System.out.println("Error : " + z);
                    } catch (Exception e) {
                        System.out.println("Error : " + e);
                    }
                }
            }
            // Printing the Output
            int sum;
            for(int i = 0; i < q; i++){
                sum = array_a[i];
                for(int j = 0; j <= array_n[i] - 1; j++){
                    double term = ((array_b[i]) * Math.pow(2, j));
                    sum += (int)term;
                    System.out.print((int)sum + " ");
                }
                System.out.println();
            }
        }
    }
}
