import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String money = sc.next();
        String organism = sc.next();
        BigInteger moneys = new BigInteger(money);
        BigInteger organisms = new BigInteger(organism);
        BigInteger quotient = moneys.divide(organisms);
        BigInteger remain = moneys.remainder(organisms);
        System.out.println(quotient);
        System.out.println(remain);
    }
}
