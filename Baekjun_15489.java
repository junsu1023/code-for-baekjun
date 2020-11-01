import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_15489 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] pascal = new int[30][30];
        for(int i=0; i<30; i++){
            pascal[i][0] = 1;
            pascal[i][i] = 1;
        }
        for(int i=1; i<30; i++){
            for(int j=1; j<30; j++){
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }
        int ans = 0;
        for(int i=r-1; i<r+w-1; i++){
            for(int j=c-1; j<c+i-r+1; j++){
                ans += pascal[i][j];
            }
        }
        System.out.println(ans);
        br.close();
    }
}
