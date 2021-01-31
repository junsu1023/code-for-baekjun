import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2422 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int icecream = Integer.parseInt(st.nextToken());
        int noMix = Integer.parseInt(st.nextToken());
        boolean[][] check = new boolean[201][201];
        for(int i=1; i<=icecream; i++){
            for(int j=i+1; j<=icecream; j++){
                check[i][j] = true;
                check[j][i] = true;
            }
        }
        for(int i=0; i<noMix; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            check[first][second] = false;
            check[second][first] = false;
        }
        int cnt = 0;
        for(int i=1; i<=icecream; i++){
            for(int j=i+1; j<=icecream; j++){
                if(check[i][j]){
                    for(int k=j+1; k<=icecream; k++){
                        if(check[i][k] && check[j][k]) cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
