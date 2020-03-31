import java.util.Scanner;

public class Baekjun_16561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<=n/3; i++){
            for(int j=1; j<=n/3; j++){
                int sum = i*3+j*3;
                if((n-sum)%3==0 && sum<n) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
