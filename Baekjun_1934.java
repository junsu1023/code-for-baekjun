import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int gcd = GCD(max, min);
            int lcm = LCM(max, min, gcd);
            System.out.println(lcm);
        }
    }

    public static int GCD(int a, int b){
        while(b>0){
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

    public static int LCM(int a, int b, int gcd){
        return (a*b)/gcd;
    }
}
