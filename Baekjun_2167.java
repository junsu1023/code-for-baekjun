import java.util.Scanner;

public class Baekjun_2167 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N+1][M+1];
        int[][] dp = new int[301][301];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=M; j++){
                arr[i][j] = sc.nextInt();
                dp[i][j] = dp[i-1][j] + dp[i][j-1] + arr[i][j] - dp[i-1][j-1];
            }
        }
        int test_case = sc.nextInt();
        int sum = 0;
        for(int tc=0; tc<test_case; tc++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            sum = dp[x][y] - dp[x][j-1] - dp[i-1][y] + dp[i-1][j-1];
            System.out.println(sum);
        }
    }

}
