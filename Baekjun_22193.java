import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Baekjun_22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstLength = Integer.parseInt(st.nextToken());
        int secondLength = Integer.parseInt(st.nextToken());
        BigInteger n1 = new BigInteger(br.readLine());
        BigInteger n2 = new BigInteger(br.readLine());
        System.out.println(n1.multiply(n2));
        br.close();
    }
}
