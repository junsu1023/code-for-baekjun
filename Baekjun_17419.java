import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String k = br.readLine();
        char[] c = k.toCharArray();
        int cnt = 0;
        for(int i=0; i<c.length; i++){
            if(c[i] == '1') cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
