import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] floor = new char[r][c];
        for(int i=0; i<r; i++){
            String s = br.readLine();
            for(int j=0; j<c; j++){
                floor[i][j] = s.charAt(j);
            }
        }
        int cnt = 0;
        for(int i=0; i<r; i++){
            char temp = '.';
            for(int j=0; j<c; j++){
                if(floor[i][j] == '-'){
                    if(floor[i][j] != temp) cnt++;
                }
                temp = floor[i][j];
            }
        }
        for(int i=0; i<c; i++){
            char temp = '.';
            for(int j=0; j<r; j++){
                if(floor[j][i] == '|'){
                    if(floor[j][i] != temp) cnt++;
                }
                temp = floor[j][i];
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
