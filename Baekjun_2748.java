import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1) System.out.println(1);
        else{
            long[] fibo = new long[n+1];
            fibo[0] = 0;
            fibo[1] = 1;
            for(int i=2; i<=n; i++){
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
            System.out.println(fibo[n]);
        }
        br.close();
    }
}
