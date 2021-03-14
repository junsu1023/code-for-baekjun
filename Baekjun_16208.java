import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_16208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] pipe = new long[n];
        long len = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            pipe[i] = Long.parseLong(st.nextToken());
            len += pipe[i];
        }
        long result = 0;
        for(int i=0; i<n; i++){
            len -= pipe[i];
            result += pipe[i] * len;
        }
        System.out.println(result);
        br.close();
    }
}
