import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] city = new int[r][c];
        for(int i=0; i<r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++){
                city[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        int check = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(city[i][j] == 1){
                    if(check%2==0){
                        x1 = i;
                        y1 = j;
                        check++;
                    }
                    else{
                        x2 = i;
                        y2 = j;
                    }
                }
            }
        }
        System.out.println(Math.abs((x2-x1))+Math.abs((y2-y1)));
    }
}
