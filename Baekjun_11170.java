import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11170 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            String connect = "";
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j=start; j<=end; j++){
                char[] check = Integer.toString(j).toCharArray();
                for(int k=0; k<check.length; k++){
                    if(check[k] == '0') cnt++;
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }
}
