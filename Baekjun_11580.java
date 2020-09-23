import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11580 {
    static int l;
    static char[] dir;
    static boolean[][] check = new boolean[20001][20001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        l  = Integer.parseInt(br.readLine());
        dir = br.readLine().toCharArray();
        direction(1000, 1000, 0);
        int cnt = 0;
        for(int i=0; i<=2000; i++)
            for(int j=0; j<=2000; j++)
                if(check[i][j])
                    cnt++;

        System.out.println(cnt);
    }
    public static void direction(int x, int y, int seq){
        check[x][y] = true;
        if(seq==l) return;
        if(dir[seq]=='E') y++;
        if(dir[seq] == 'W') y--;
        if(dir[seq] == 'S') x--;
        if(dir[seq] == 'N') x++;
        direction(x, y, seq+1);
    }
}
