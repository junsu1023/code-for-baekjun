import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_12779 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long len = b-a;
        long cnt = 0;
        for(long i=1; i<=b; i++){
            if(i*i > b) break;
            if(i*i > a) cnt++;
        }
        if(cnt == 0) System.out.println(0);
        else{
            long g = GCD(cnt, len);
            System.out.println(cnt/g + "/" + len/g);
        }
    }
    public static long GCD(long a, long b){
        if(b==0) return a;
        return GCD(b, a%b);
    }
}
