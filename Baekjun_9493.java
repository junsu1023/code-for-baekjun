import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_9493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            if(m==0) break;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            double trainTime = (double)m / a * 3600;
            double airplaneTime = (double)m / b * 3600;
            int diff = (int)Math.round(trainTime - airplaneTime);
            int hour = diff / 3600;
            int minute = diff % 3600 / 60;
            int second = diff % 3600 % 60;
            System.out.printf(String.format("%d:%02d:%02d\n", hour, minute, second));
        }
        br.close();
    }
}
