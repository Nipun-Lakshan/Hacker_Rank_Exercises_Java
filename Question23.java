import java.util.Scanner;

class Question23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String IP = in.nextLine();
            if (IP.isEmpty() || IP.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(IP.matches(new MyRegex().pattern));
        }

        in.close();
    }
}

class MyRegex {
    public String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}