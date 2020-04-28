import java.math.BigInteger;
import java.util.Scanner;

public class Baekjun_10093 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String n1 = sc.next();
        String n2 = sc.next();
        BigInteger num1 = new BigInteger(n1);
        BigInteger num2 = new BigInteger(n2);
        if(num1.compareTo(num2)==0) sb.append("0");
        else if(num1.compareTo(num2)==-1){
            BigInteger sub = num2.subtract(num1).subtract(BigInteger.ONE);
            sb.append(sub + "\n");
            for(BigInteger i = num1.add(BigInteger.ONE); i.compareTo(num2)==-1; i=i.add(BigInteger.ONE)){
                sb.append(i + " ");
            }
        }
        else{
            BigInteger sub = num1.subtract(num2).subtract(BigInteger.ONE);
            sb.append(sub + "\n");
            for(BigInteger i = num2.add(BigInteger.ONE); i.compareTo(num1)==-1; i=i.add(BigInteger.ONE)){
                sb.append(i + " ");
            }
        }
        System.out.println(sb);
    }
}
