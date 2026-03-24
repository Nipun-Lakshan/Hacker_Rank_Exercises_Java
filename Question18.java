import java.util.Scanner;

class Question18 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i < ((s.length()) - k + 1); i++) {
            String current = s.substring(i, (i + k));

            if (current.compareTo(largest) > 0) {
                largest = current;
            }

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}