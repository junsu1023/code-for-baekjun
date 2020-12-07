import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17262 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 100001;
        int max = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(start > max) max = start;
            if(end <min) min = end;
        }
        int interval = max - min;
        if(interval < 0) interval = 0;
        System.out.println(interval);
        br.close();
    }
}
