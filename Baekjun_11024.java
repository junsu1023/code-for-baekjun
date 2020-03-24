import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int test_case = Integer.parseInt(br.readLine());
        while(test_case--!=0){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}
