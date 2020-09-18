import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17127 {
    public static int[] arr = new int[10];
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int val = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n-1; k++){
                    val = mul(0, i) + mul(i+1, j) + mul(j+1, k) + mul(k+1, n-1);
                    max = Math.max(max, val);
                }
            }
        }
        System.out.println(max);
        br.close();
    }
    public static int mul(int start, int end){
        int val = 1;
        for(int i=start; i<=end; i++) val *= arr[i];
        return val;
    }
}
