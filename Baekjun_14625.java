import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startHour = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true){
            if(startHour%10==n || startHour/10==n || startMinute%10==n || startMinute/10==n) cnt++;
            if(startHour == endHour && startMinute == endMinute) break;
            startMinute += 1;
            if(startMinute == 60){
                startMinute = 0;
                startHour++;
            }
        }
        System.out.println(cnt);
    }
}
