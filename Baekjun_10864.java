import java.util.Scanner;

public class Baekjun_10864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[n+1];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            f[a]++;
            f[b]++;
        }
        for(int i=1; i<f.length; i++) System.out.println(f[i]);
    }
}
