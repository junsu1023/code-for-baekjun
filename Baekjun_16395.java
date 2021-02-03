import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_16395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] pascal = new int[31][31];
        pascal[1][1] = 1;
        for(int i=2; i<=n; i++){
            pascal[i][1] = 1;
            for(int j=1; j<=i; j++){
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
            pascal[i][n] = 1;
        }
        System.out.println(pascal[n][k]);
        br.close();
    }
}
