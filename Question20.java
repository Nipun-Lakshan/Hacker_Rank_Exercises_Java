import java.util.Scanner;

class Question20 {
    public static boolean isAnagram(String a, String b) {
        String lowerCaseA = a.toLowerCase();
        String lowerCaseB = b.toLowerCase();
        String alphabet[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        int frequencyA[] = new int[26];
        int frequencyB[] = new int[26];
        for (int i = 0; i < 26; i++) {
            char letter = alphabet[i].charAt(0);
            for (int j = 0; j < lowerCaseA.length(); j++) {
                if (letter == (lowerCaseA.charAt(j))) {
                    frequencyA[i] += 1;
                }
            }
            for (int k = 0; k < lowerCaseB.length(); k++) {
                if (letter == (lowerCaseB.charAt(k))) {
                    frequencyB[i] += 1;
                }
            }
        }
        for (int i = 0; i < frequencyA.length; i++) {
            if (frequencyA[i] != frequencyB[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}