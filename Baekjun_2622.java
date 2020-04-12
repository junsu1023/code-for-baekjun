import java.util.Scanner;

public class Baekjun_2622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<n; i++){
            for(int j=i; j<n; j++){
                int k = n-(i+j);
                if(k < j) break;
                if(i+j > k) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
