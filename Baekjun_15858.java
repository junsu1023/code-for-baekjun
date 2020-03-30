import java.math.BigDecimal;
import java.util.Scanner;

public class Baekjun_15858 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        BigDecimal n1 = new BigDecimal(a);
        BigDecimal n2 = new BigDecimal(b);
        BigDecimal n3 = new BigDecimal(c);
        BigDecimal temp = n1.multiply(n2);
        BigDecimal result = temp.divide(n3, 12, BigDecimal.ROUND_HALF_UP);
        System.out.println(result);
    }
}
