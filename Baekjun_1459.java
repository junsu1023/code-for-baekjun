import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        long w = Integer.parseInt(st.nextToken());
        long s = Integer.parseInt(st.nextToken());
        long temp = (x+y)%2;
        if(x<y){
            long t = x;
            x = y;
            y = t;
        }
        System.out.println(Math.min((x+y)*w, Math.min((x-temp)*s + temp * w, y*s + (x-y)*w)));
    }
}
