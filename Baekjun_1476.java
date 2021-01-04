import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int earth = Integer.parseInt(st.nextToken());
        int sun = Integer.parseInt(st.nextToken());
        int moon = Integer.parseInt(st.nextToken());
        int year = 1;
        int result = 0;
        while(true){
            if((year-earth)%15==0 && (year-sun)%28==0 && (year-moon)%19==0){
                result = year;
                break;
            }
            year++;
        }
        System.out.println(result);
    }
}
