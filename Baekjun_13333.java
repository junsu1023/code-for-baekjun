import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_13333 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=n; i>=0; i--){
            int cnt = 0;
            for(int j=0; j<n; j++){
                if(arr[j] >= i) cnt++;
            }
            if(cnt >= i){
                System.out.println(i);
                break;
            }
        }
    }
}
