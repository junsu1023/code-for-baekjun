import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        if(n%5==0) System.out.println(n/5);
        else{
            while(true) {
                if(n < 0){
                    System.out.println(-1);
                    break;
                }
                if(n == 0) {
                    System.out.println(n);
                    break;
                }
                n -= 2;
                cnt++;
                if(n%5 == 0){
                    cnt += n/5;
                    System.out.println(cnt);
                    break;
                }
            }
        }
        br.close();
    }
}
