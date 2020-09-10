import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14647 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[][] arr = new int[n][m];
        int cmax = 0, rmax = 0, cnt = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int csum = 0;
            for(int j=0; j<m; j++){
                int temp = Integer.parseInt(st2.nextToken());
                arr[i][j] = find(temp);
                csum += arr[i][j];
                cnt += arr[i][j];
            }
            cmax = Math.max(cmax, csum);
        }
        for(int i=0; i<m; i++){
            int rsum = 0;
            for(int j=0; j<n; j++){
                rsum += arr[j][i];
            }
            rmax = Math.max(rmax, rsum);
        }
        int max = Math.max(rmax, cmax);
        System.out.println(cnt - max);
    }
    public static int find(int a){
        int cnt = 0;
        while(a != 0){
            if(a%10==9) cnt++;
            a /= 10;
        }
        return cnt;
    }
}
