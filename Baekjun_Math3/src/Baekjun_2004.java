import java.util.Scanner;

public class Baekjun_2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long M = sc.nextInt();
        long two_count = 0, five_count = 0;
        for(long i=2; i<=N; i*=2) two_count += N/i;
        for(long i=2; i<=N-M; i*=2) two_count -= (N-M)/i;
        for(long i=2; i<=M; i*=2) two_count -= M/i;
        for(long i=5; i<=N; i*=5) five_count += N/i;
        for(long i=5; i<=N-M; i*=5) five_count -= (N-M)/i;
        for(long i=5; i<=M; i*=5) five_count -= M/i;
        System.out.println(Math.min(two_count, five_count));
    }
}
