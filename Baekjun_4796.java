import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_4796 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int use_day = Integer.parseInt(st.nextToken());
            int total_day = Integer.parseInt(st.nextToken());
            int vacation = Integer.parseInt(st.nextToken());
            if(use_day==0 && total_day==0 && vacation==0) break;
            int divide_day = vacation / total_day;
            int rest_day = vacation % total_day;
            int use_total = 0;
            if(rest_day > use_day) use_total = divide_day * use_day + use_day;
            else use_total = divide_day * use_day + rest_day;
            System.out.println("Case " + cnt + ": " + use_total);
            cnt++;
        }
        br.close();
    }
}
