import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_12782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String first = st.nextToken();
            String second = st.nextToken();
            int zero = 0;
            int one = 0;
            for(int j=0; j<second.length(); j++){
                if(first.charAt(j) == second.charAt(j)) continue;
                if(second.charAt(j) == '1') one++;
                else zero++;
            }
            int temp = Math.min(zero, one);
            System.out.println(temp + (one + zero) - temp * 2);
        }
        br.close();
    }
}
