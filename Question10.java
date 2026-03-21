import java.io.*;
import java.util.*;

class Result_Question10 {

    public static String findDay(int month, int day, int year) {

        // Calendar is an abstract class. Cannot create objects like new Calendar().
        // Instead, we can use the getInstance() method to get a Calendar object.
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, (month - 1), day);
        // month - 1 because of 0-based indexing in Calendar class (January is 0,
        // February is 1, ..., December is 11)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // Sunday = 1, Monday = 2, Tuesday = 3, Wednesday = 4, Thursday = 5, Friday = 6,
        // Saturday = 7 -> -1 because of 0-based indexing in array
        String days[] = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
                "THURSDAY", "FRIDAY", "SATURDAY" };
        return days[dayOfWeek - 1];
    }

}

public class Question10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstMultipleInput[] = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result_Question10.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
