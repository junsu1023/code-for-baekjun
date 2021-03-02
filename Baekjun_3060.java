import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_3060 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int tc=0; tc<testCase; tc++){
            int feed = Integer.parseInt(br.readLine());
            int day = 1;
            long[] eat = new long[6];
            long total = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<6; i++){
                eat[i] = Long.parseLong(st.nextToken());
                total += eat[i];
            }
            while(total <= feed){
                total *= 4;
                day++;
            }
            System.out.println(day);
        }
        br.close();
    }
}