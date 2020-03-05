import java.math.BigDecimal;
import java.util.Scanner;

public class Baekjun_15610 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String n = String.valueOf((Math.sqrt(Double.parseDouble(num))));
        BigDecimal process = new BigDecimal(n);
        BigDecimal four = new BigDecimal("4");
        BigDecimal result = process.multiply(four);
        System.out.println(result.setScale(8, BigDecimal.ROUND_CEILING));
    }
}
