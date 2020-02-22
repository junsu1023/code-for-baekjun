import java.util.Scanner;

public class Baekjun_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(binomial(N, K));
    }

    public static int binomial(int N, int K){
        int denominator = 1;
        int molecule = 1;
        for(int i=1; i<=K; i++) molecule *= i;
        for(int i=N; i>N-K; i--) denominator *= i;
        int result = denominator / molecule;
        return result;
    }
}
