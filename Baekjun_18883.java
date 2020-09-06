import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_18883 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int temp = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==m-1) sb.append(temp++ + "\n");
                else sb.append(temp++ + " ");
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}