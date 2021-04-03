import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int n= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] pos = new int[n];
        for(int i=0; i<n; i++) pos[i] = Integer.parseInt(st.nextToken());
        int max = pos[0];
        for(int i=0; i<n-1; i++){
            int temp = pos[i + 1] - pos[i];
            if(temp % 2 == 0) temp /= 2;
            else temp = (temp + 1) / 2;
            if(temp > max) max = temp;
        }
        max = Math.max(max, len - pos[n-1]);
        System.out.println(max);
        br.close();
    }
}
