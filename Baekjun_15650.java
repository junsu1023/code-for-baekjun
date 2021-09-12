import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_15650 {
    public static int[] arr;
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        dfs(1,0);
        System.out.println(sb.toString());
        br.close();
    }
    public static void dfs(int start, int len){
        if(len == m){
            for(int i:arr) sb.append(i).append(" ");
            sb.append("\n");
            return;
        }
        for(int i=start; i<=n; i++){
            arr[len] = i;
            dfs(i+1, len+1);
        }
    }
}
