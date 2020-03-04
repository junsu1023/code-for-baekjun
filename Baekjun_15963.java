import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_15963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String M = sc.next();
        BigInteger songchan = new BigInteger(N);
        BigInteger teacher  = new BigInteger(M);
        if(songchan.equals(teacher)) System.out.println(1);
        else System.out.println(0);
    }
}
