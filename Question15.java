import java.util.*;

class Question15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String temp = S.substring(start, (end));
        System.out.println(temp);
        in.close();

    }
}