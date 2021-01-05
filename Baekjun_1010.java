import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] dp = new int[n+1][m+1];
            for(int i=2; i<=n; i++) dp[i][1] = 0;
            for(int i=1; i<=m; i++) dp[1][i] = i;
            for(int i=2; i<=n; i++) {
                for (int j=2; j<=m; j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                }
            }
            System.out.println(dp[n][m]);
        }
        br.close();
    }
}
