import java.io.*;
import java.util.StringTokenizer;

public class Baekjun_1952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] mx = {0, 1, 0, -1};
        int[] my = {-1, 0, 1, 0};
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[][] visit = new boolean[m][n];
        int x = 0, y = 0, dir = 1, cnt = 0;
        while(true){
            if(visit[y][x]) break;
            visit[y][x] = true;
            int xx = x + mx[dir];
            int yy = y + my[dir];
            if(xx < 0 || xx >= n || yy < 0 || yy >= m || visit[yy][xx]){
                if(dir == 3) dir = 0;
                else dir++;
                cnt++;
            }
            x = x + mx[dir];
            y = y + my[dir];
        }
        bw.write(cnt-1 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
