import java.util.*;

public class Question13 {

    public static void main(String[] args) {

        // Requets inputs from user
        try (Scanner in = new Scanner(System.in);) {

            int n = in.nextInt();
            in.close();

            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        }
    }

}