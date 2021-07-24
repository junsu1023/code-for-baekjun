import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjun_8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n1 = new BigInteger(br.readLine());
        BigInteger n2 = new BigInteger(br.readLine());
        System.out.println(n1.add(n2).divide(BigInteger.TWO));
        System.out.println(n1.subtract(n2).divide(BigInteger.TWO));
        br.close();
    }
}
