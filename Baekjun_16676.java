import java.io.*;

public class Baekjun_16676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cost = Integer.parseInt(br.readLine());
        int n = 1;
        int m = 10;
        int cnt = 1;
        while(true){
            if(cost>=n && cost<=m) break;
            else{
                n = n*10+1;
                m = m*10+10;
                cnt++;
            }
        }
        if(cost==0) cnt = 1;
        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
