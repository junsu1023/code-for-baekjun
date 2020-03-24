import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_11312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            String origin = sc.next();
            BigInteger l1 = new BigInteger(origin);
            String length = sc.next();
            BigInteger l2 = new BigInteger(length);
            BigInteger temp = l1.divide(l2);
            BigInteger result = temp.pow(2);
            System.out.println(result);
        }
    }
}
