import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_15080 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time1 = br.readLine();
        String time2 = br.readLine();
        String[] t1 = time1.split(" : ");
        String[] t2 = time2.split(" : ");
        int second = Integer.parseInt(t2[2]) - Integer.parseInt(t1[2]);
        int minute = Integer.parseInt(t2[1]) - Integer.parseInt(t1[1]);
        int hour = Integer.parseInt(t2[0]) - Integer.parseInt(t1[0]);
        if(second < 0){
            second += 60;
            minute--;
        }
        if(minute < 0){
            minute += 60;
            hour--;
        }
        if(hour < 0){
            hour += 24;
        }
        System.out.println(hour*3600 + minute*60 + second);
    }
}
