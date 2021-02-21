import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_13657 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[][] square = new int[m][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int x = 0;
        int y = 0;
        int dir = 0;
        boolean check = true;
        for(int i=0; i<n; i++){
            String[] command = br.readLine().split(" ");
            String order = command[0];
            int move = Integer.parseInt(command[1]);
            if(order.equals("MOVE") && check){
                for(int j=0; j<move; j++){
                    x += dx[dir];
                    y += dy[dir];
                    if(x<0 || x>=m || y<0 || y>=m) check = false;
                }
            }
            else if(order.equals("TURN")){
                if(move == 0) dir = (dir+3)%4;
                else dir = (dir+1)%4;
            }
        }
        if(check) System.out.println(x + " " + y);
        else System.out.println(-1);
        br.close();
    }
}
