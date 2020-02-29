//100점 나오는 코드
import java.io.*;
import java.math.BigInteger;

public class Baekjun_15740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");
        BigInteger num1 = new BigInteger(num[0]);
        BigInteger num2 = new BigInteger(num[1]);
        BigInteger addResult = num1.add(num2);
        bw.write(addResult + "\n");
        br.close();
        bw.close();
    }
}
