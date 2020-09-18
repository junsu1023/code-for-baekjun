import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_10570 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            int[] cnt = new int[1001];
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++){
                int s = Integer.parseInt(br.readLine());
                cnt[s]++;
            }
            int max = 0;
            int idx = 0;
            for(int i=1; i<1001; i++){
                if(cnt[i] > max){
                    max = cnt[i];
                    idx = i;
                }
            }
            System.out.println(idx);
        }
        br.close();
    }
}
