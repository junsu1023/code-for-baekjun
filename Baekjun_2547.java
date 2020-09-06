import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_2547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num==0) System.out.println("NO");
        while(num-->0){
            BigInteger temp = BigInteger.ZERO;
            BigInteger n = sc.nextBigInteger();
            BigInteger t = n;
            while(!n.equals(BigInteger.ZERO)){
                temp = temp.add(sc.nextBigInteger());
                n = n.subtract(BigInteger.ONE);
            }
            BigInteger[] bi = temp.divideAndRemainder(t);
            if(bi[1].compareTo(BigInteger.ZERO) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
