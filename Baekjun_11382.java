import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_11382{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        BigInteger c = new BigInteger(C);
        BigInteger result = a.add(b).add(c);
        System.out.println(result);
    }
}