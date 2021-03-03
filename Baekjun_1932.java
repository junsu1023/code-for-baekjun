import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] saveNum = new int[n][n];
        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<=i; j++){
                saveNum[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = saveNum[0][0];
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0) dp[i][0] = dp[i-1][j] + saveNum[i][j];
                else if(j==i) dp[i][j] = dp[i-1][j-1] + saveNum[i][j];
                else dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + saveNum[i][j];
            }
        }
        int max = 0;
        for(int i=0; i<n; i++){
            if(dp[n-1][i] > max) max = dp[n-1][i];
        }
        System.out.println(max);
        br.close();
    }
}
