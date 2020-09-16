import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1996 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[1000][1000];
        for(int i=1; i<=n; ++i){
            String s = br.readLine();
            char[] c = s.toCharArray();
            for(int j=1; j<=n; ++j){
                map[i][j] = c[j-1];
            }
        }
        int[][] ans = new int[1000][1000];
        int[] mx = {-1, -1, -1, 0, 0, 1, 1, 1 };
        int[] my = {-1, 0, 1, -1, 1, -1, 0, 1 };
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                for(int k=0; k<8; ++k){
                    int x = i + mx[k];
                    int y = j + my[k];
                    if(map[x][y] != '.') continue;
                    if(map[i][j] < '0' || map[x][y] > '9') continue;
                    ans[x][y] += (map[i][j] - '0');
                }
            }
        }
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n; ++j){
                if(map[i][j] != '.'){
                    sb.append("*");
                    continue;
                }
                if(ans[i][j] > 9){
                    sb.append("M");
                    continue;
                }
                sb.append(ans[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
        br.close();
    }
}
