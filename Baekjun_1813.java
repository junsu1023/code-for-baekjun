import java.util.Scanner;

public class Baekjun_1813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[100000];
        for(int i=0; i<N; i++){
            int n = sc.nextInt();
            arr[n]++;
        }
        for (int i = N; i>=0; i--) {
            if (arr[i] == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
