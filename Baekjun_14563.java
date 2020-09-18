import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14563 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;
            for(int j=1; j<num; j++){
                if(num%j==0) sum += j;
            }
            if(num>sum) System.out.println("Deficient");
            else if(num<sum) System.out.println("Abundant");
            else System.out.println("Perfect");
        }
        br.close();
    }
}
