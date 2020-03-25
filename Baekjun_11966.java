import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_11966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger one = BigInteger.ONE;
        BigInteger zero = BigInteger.ZERO;
        BigInteger two = new BigInteger("2");
        BigInteger result = BigInteger.ZERO;
        boolean check = true;
        if(n.compareTo(one)==0){
            result = one;
            check = false;
        }
        else if(n.mod(two).compareTo(one)==0){
            result = zero;
            check = false;
        }
        while(check){
            n = n.divide(two);
            if(n.compareTo(one)==0){
                result = one;
                check = false;
            }
            else if(n.mod(two).compareTo(one)==0){
                result = zero;
                check = false;
            }
        }
        System.out.println(result);
    }
}
