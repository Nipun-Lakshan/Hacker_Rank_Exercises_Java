import java.util.*;

class Question11 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String lines[] = new String[0];
            while (scanner.hasNextLine()) {
                String newLine = scanner.nextLine();
                if (newLine.isEmpty()) {
                    break;
                }
                String temp[] = new String[lines.length + 1];
                for (int i = 0; i < lines.length; i++) {
                    temp[i] = lines[i];
                }
                temp[lines.length] = newLine;
                lines = temp;
            }

            for (int i = 0; i < lines.length; i++) {
                System.out.println((i + 1) + " " + lines[i]);
            }
        }

    }
}