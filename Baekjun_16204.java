import java.util.Scanner;

public class Baekjun_16204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(Math.min(M, K) + Math.min(N-M, N-K));
    }
}
