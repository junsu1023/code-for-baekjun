import java.util.Scanner;

public class Baekjun_17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stick = new int[n];
        for(int i=0; i<n; i++) stick[i] = sc.nextInt();
        int cnt = 0;
        int max = 0;
        for(int i=n-1; i>=0; i--){
            if(stick[i] > max){
                cnt++;
                max = stick[i];
            }
        }
        System.out.println(cnt);
    }
}
