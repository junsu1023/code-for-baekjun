import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=2; i<=n; i++) arr[i] = i;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2; i<=sqrt; i++){
            if(arr[i] == 0) continue;
            for(int j=i+i; j<=n; j=j+i){
                arr[j] = 0;
            }
        }
        for(int i=m; i<=n; i++){
            if(arr[i] != 0) System.out.println(arr[i]);
        }
    }
}
