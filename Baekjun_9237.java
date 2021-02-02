import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_9237 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) tree[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(tree);
        int result = 0;
        int cnt = 2;
        for(int i=n-1; i>=0; i--){
            result = Math.max(result, cnt + tree[i]);
            cnt++;
        }
        System.out.println(result);
        br.close();
    }
}
