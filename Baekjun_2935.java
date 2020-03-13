import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_2935 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.nextLine());
        char op = sc.nextLine().charAt(0);
        BigInteger n2 = new BigInteger(sc.nextLine());
        if(op == '+') System.out.println(n1.add(n2));
        else if(op == '*') System.out.println(n1.multiply(n2));
    }
}
