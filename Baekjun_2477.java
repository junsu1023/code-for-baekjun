import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int first = Integer.parseInt(st.nextToken());
        int pre = first;
        for(int i=1; i<6; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int now = Integer.parseInt(st.nextToken());
            max = Math.max(now * pre, max);
            sum += (now * pre);
            pre = now;
        }
        max = Math.max(first * pre, max);
        sum += (first * pre);
        int result = (max - (max * 3 - sum)) * n;
        System.out.println(result);
        br.close();
    }
}
