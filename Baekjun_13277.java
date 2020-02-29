import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_13277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger result = n1.multiply(n2);
        System.out.println(result);
    }
}
