import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_5555 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++){
            String ring = br.readLine();
            String copy = ring + ring;
            boolean check = copy.contains(str);
            if(check) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
