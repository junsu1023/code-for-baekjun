import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        int cnt = 0;
        int num = 1;
        while(true){
            if(sum > n) break;
            sum += num;
            num++;
            cnt++;
        }
        System.out.println(cnt-1);
        br.close();
    }
}
