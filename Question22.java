import java.util.Scanner;
import java.util.regex.*;

class Question22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int i = 0;
        Boolean result[] = new Boolean[testCases];
        while (testCases > 0) {
            testCases--;
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                result[i] = true;
                i++;
            } catch (Exception e) {
                result[i] = false;
                i++;
            }

        }
        for (int j = 0; j < result.length; j++) {
            if (result[j] == true) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
