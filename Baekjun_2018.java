import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(n == i * j + (j - 1) * j / 2){
                    cnt++;
                    break;
                }
                else if(n < i * j + (j + 1) * j / 2) break;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
