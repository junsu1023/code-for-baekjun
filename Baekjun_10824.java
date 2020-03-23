import java.util.Scanner;

public class Baekjun_10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String C = String.valueOf(c);
        String D = String.valueOf(d);
        A += B;
        C += D;
        long n1 = Long.parseLong(A);
        long n2 = Long.parseLong(C);
        System.out.println(n1+n2);
    }
}
