import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long total = 0;
        for(int i=0; i<n; i++){
            total += Math.abs(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            total += Math.abs(Integer.parseInt(st.nextToken()));
        }
        System.out.println(total);
        br.close();
    }
}
