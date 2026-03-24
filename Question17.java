import java.io.*;
import java.util.*;

class Question17 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();

        // Define Variables & Constants
        int n = 0;
        int max = Integer.MIN_VALUE;
        int total = 0;
        final int NUMBER_OF_HOURGLASSES_IN_6_BY_6_2D_ARRAY = 16;

        // Define an Array
        int sums[] = new int[NUMBER_OF_HOURGLASSES_IN_6_BY_6_2D_ARRAY];

        // Top Row Elements
        while (n < 16) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    total = 0;
                    for (int k = 0; k < 3; k++) {
                        total += arr.get(i).get(j + k);
                    }
                    sums[n] += total;
                    n++;
                }
            }
        }

        // Middle Row Elements
        n = 0;
        while (n < 16) {
            for (int i = 1; i < 5; i++) {
                for (int j = 1; j < 5; j++) {
                    sums[n] += arr.get(i).get(j);
                    n++;
                }
            }
        }

        // Bottom Row Elements
        n = 0;
        total = 0;
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                total = 0;
                for (int k = 0; k < 3; k++) {
                    total += arr.get(i).get(j + k);
                }
                sums[n] += total;
                n++;
            }
        }

        // Find Max Sum
        for (int i = 0; i < sums.length; i++) {
            if (max < sums[i]) {
                max = sums[i];
            }
        }

        // Print Max Sum
        System.out.print(max);

    }
}
