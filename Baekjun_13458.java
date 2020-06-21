import java.util.Scanner;

public class Baekjun_13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tester = new int[n];
        for(int i=0; i<n; i++) tester[i] = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long total = 0;
        for(int i=0; i<n; i++){
            tester[i] -= b;
            total++;
            if(tester[i] > 0) {
                if (tester[i] % c == 0) total += tester[i] / c;
                else total += tester[i] / c + 1;
            }
        }
        System.out.println(total);
    }
}
