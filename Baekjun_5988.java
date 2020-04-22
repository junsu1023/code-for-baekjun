import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_5988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String num = sc.nextLine();
            BigInteger n = new BigInteger(num);
            BigInteger two = new BigInteger("2");
            BigInteger zero = BigInteger.ZERO;
            if(n.remainder(two) == zero) System.out.println("even");
            else System.out.println("odd");
        }
    }
}
