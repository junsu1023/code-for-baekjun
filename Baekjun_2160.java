import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_2160 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[][][] draw = new char[n][5][7];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                String s = br.readLine();
                for(int k=0; k<7; k++){
                    draw[i][j][k] = s.charAt(k);
                }
            }
        }
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        int t1 = 0;
        int t2 = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                cnt = 0;
                for(int x=0; x<5; x++){
                    for(int y=0; y<7; y++){
                        if(draw[i][x][y] != draw[j][x][y]) cnt++;
                    }
                }
                if(min > cnt){
                    min = cnt;
                    t1 = i+1;
                    t2 = j+1;
                }
            }
        }
        bw.write(t1 + " " + t2 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
