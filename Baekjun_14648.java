import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14648 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        long[] arr = new long[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        for(int i=0; i<q; i++){
            st = new StringTokenizer(br.readLine());
            long compare = Long.parseLong(st.nextToken());
            long sum = 0;
            if(compare == 1){
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                for(long j=a; j<=b; j++) sum += arr[(int)j];
                swap(arr, a, b);
                System.out.println(sum);
            }
            else if(compare == 2){
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                long d = Long.parseLong(st.nextToken());
                long sum1 = 0, sum2 = 0;
                for(long j=a; j<=b; j++) sum1 += arr[(int)j];
                for(long j=c; j<=d; j++) sum2 += arr[(int)j];
                long total = sum1 - sum2;
                System.out.println(total);
            }
        }
    }
    public static void swap(long[] arr, long a, long b){
        long temp = arr[(int)a];
        arr[(int)a] = arr[(int)b];
        arr[(int)b] = temp;
    }
}
