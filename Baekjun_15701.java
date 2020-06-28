import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_15701 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        boolean check = false;
        for(int i=1; i*i<=n; i++){
            if(n%i==0) cnt++;
            if(i*i==n) check = true;
        }
        if(!check) cnt *= 2;
        else cnt = cnt*2-1;
        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
