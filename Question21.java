import java.util.*;

class Question21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String checkString = "[^A-Za-z]*";
        if (s.matches(checkString)) {
            System.out.println("0");
            scan.close();
            return;
        }
        String regex = "[ !,?._'@]+";
        String tokens[] = s.trim().split(regex);
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        scan.close();
    }
}