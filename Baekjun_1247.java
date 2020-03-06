import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=0; tc<3; tc++){
            int num = sc.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int i=0; i<num; i++){
                String input = sc.next();
                BigInteger n = new BigInteger(input);
                sum = sum.add(n);
            }
            if(sum.compareTo(BigInteger.ZERO)==0) System.out.println(0);
            else if(sum.compareTo(BigInteger.ZERO)==-1) System.out.println("-");
            else if(sum.compareTo(BigInteger.ZERO)==1) System.out.println("+");
            sum = new BigInteger("0");
        }
    }
}
