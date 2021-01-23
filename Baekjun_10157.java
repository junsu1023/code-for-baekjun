import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_10157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int cnt = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int colSize = Integer.parseInt(st.nextToken());
        int rowSize = Integer.parseInt(st.nextToken());
        int waitingNumber = Integer.parseInt(br.readLine());
        int[][] seat = new int[rowSize][colSize];
        if(rowSize * colSize < waitingNumber){
            System.out.println("0");
            System.exit(0);
        }
        int x = rowSize-1;
        int y = 0;
        int dir = 0;
        while (cnt != waitingNumber){
            seat[x][y] = cnt;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx<0 || ny<0 || nx>=rowSize || ny>=colSize || seat[nx][ny]!=0){
                dir++;
                if(dir == 4) dir = 0;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
            cnt++;
        }
        System.out.println(y+1 + " " + (rowSize-x));
        br.close();
    }
}
