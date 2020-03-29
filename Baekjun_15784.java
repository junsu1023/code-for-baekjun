import java.io.*;
import java.util.StringTokenizer;

public class Baekjun_15784 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] seat = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                seat[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int zinseo = seat[a][b];
        for(int i=1; i<=n; i++){
            if(seat[i][b] > seat[a][b]) zinseo = seat[i][b];
            if(seat[a][i] > seat[a][b]) zinseo = seat[a][i];
        }
        if(zinseo == seat[a][b]) bw.write("HAPPY\n");
        else bw.write("ANGRY\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
