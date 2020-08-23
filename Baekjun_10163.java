import java.io.*;

public class Baekjun_10163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[103][103];
        int[] cnt = new int[103];
        for(int tc=1; tc<=n; tc++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int wid = Integer.parseInt(input[2]);
            int hei = Integer.parseInt(input[3]);
            for(int i=x; i<x+wid; i++){
                for(int j=y; j<y+hei; j++){
                    map[i][j] = tc;
                }
            }
        }
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                cnt[map[i][j]]++;
            }
        }
        for(int i=1; i<=n; i++) bw.write(cnt[i] + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
