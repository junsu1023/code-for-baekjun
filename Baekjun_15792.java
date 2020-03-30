import java.math.BigDecimal;
import java.util.Scanner;

public class Baekjun_15792 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        BigDecimal n1 = new BigDecimal(num1);
        BigDecimal n2 = new BigDecimal(num2);
        System.out.println(n1.divide(n2, 1000, BigDecimal.ROUND_HALF_UP));
    }
}
