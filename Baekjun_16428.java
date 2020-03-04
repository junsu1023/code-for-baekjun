//50점으로 채점되는 코드
import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_16428 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger share = n1.divide(n2);
        BigInteger remain = n1.remainder(n2);
        System.out.println(share);
        System.out.println(remain);
    }
}
