import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_2338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger addResult = n1.add(n2);
        BigInteger subResult = n1.subtract(n2);
        BigInteger mulResult = n1.multiply(n2);
        System.out.println(addResult);
        System.out.println(subResult);
        System.out.println(mulResult);
    }
}
