import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=1; i<=n; i++){
            int temp = i;
            while(temp != 0){
                if(temp % 10 == num) cnt++;
                temp /= 10;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
