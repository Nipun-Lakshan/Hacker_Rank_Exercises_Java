import java.util.*;

class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversed = "";
        for (int i = (A.length() - 1); i >= 0; i--) {
            reversed += A.charAt(i);
        }
        if (A.equals(reversed)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}