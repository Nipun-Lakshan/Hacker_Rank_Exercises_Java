import java.io.*;
import java.math.*;

class Question24 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger temp = new BigInteger(n);
        System.out.println((temp.isProbablePrime(1)) ? "prime" : "not prime");

        bufferedReader.close();
    }
}
