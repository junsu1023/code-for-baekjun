import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjun_13223 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split(":");
        String[] bomb = br.readLine().split(":");
        int ntime = Integer.parseInt(now[0])*3600 + Integer.parseInt(now[1])*60 + Integer.parseInt(now[2]);
        int btime = Integer.parseInt(bomb[0])*3600  + Integer.parseInt(bomb[1])*60 + Integer.parseInt(bomb[2]);
        int total = btime - ntime;
        if(total<0) total += 86400;
        total %= 86400;
        if(total==0) total += 86400;
        int h = total / 3600;
        int m = total % 3600 / 60;
        int s = total % 3600 % 60;
        System.out.println(String.format("%02d:%02d:%02d", h, m, s));
        br.close();
    }
}
