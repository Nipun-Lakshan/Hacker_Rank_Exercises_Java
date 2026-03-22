import java.util.*;

public class Question12 {

    // Define a Static Variables
    public static boolean flag = false;
    public static int B;
    public static int H;

    // Define a Method
    public static void getValues() {

        try (Scanner scanner = new Scanner(System.in);) {

            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();

            if ((input1 <= 0) || (input2 <= 0) || (input2 > 100) || (input1 > 100)) {
                System.out.print("java.lang.Exception: Breadth and height must be positive");
                return;
            } else {
                B = input1;
                H = input2;
                flag = true;
            }
        }
    }

    // Static Initialization Block
    static {
        getValues();
    }

    // Main Method
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }// end of main

}// end of class
