import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_3029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split(":");
        String[] bomb = br.readLine().split(":");
        int sdistance = Integer.parseInt(bomb[2]) - Integer.parseInt(now[2]);
        int mdistance = Integer.parseInt(bomb[1]) - Integer.parseInt(now[1]);
        int hdistance = Integer.parseInt(bomb[0]) - Integer.parseInt(now[0]);
        if(sdistance < 0){
            sdistance  += 60 ;
            mdistance -= 1;
        }
        if(mdistance < 0){
            mdistance += 60 ;
            hdistance -= 1;
        }
        if(hdistance < 0) hdistance += 24;
        if(hdistance == 0 && mdistance == 0 && sdistance == 0) System.out.println("24:00:00");
        else System.out.println(String.format("%02d:%02d:%02d", hdistance, mdistance, sdistance));
    }
}
