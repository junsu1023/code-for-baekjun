import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] medal = new int[n][4];
        long[][] score = new long[n][2];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                medal[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<n; i++){
            score[i][0] = medal[i][0];
            score[i][1] = medal[i][1]* 1000000000000L + medal[i][2]* 1000000L + medal[i][3];
        }
        int result = 1;
        for(int i=0; i<n; i++){
            if(score[i][0] == k){
                for(int j=0; j<n; j++){
                    if(score[i][1] < score[j][1]) result++;
                }
            }
        }
        System.out.println(result);
        br.close();
    }
}
