import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_3226 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s_time = st.nextToken();
            int time = Integer.parseInt(st.nextToken());
            String[] temp = s_time.split(":");
            int h = Integer.parseInt(temp[0]);
            int m = Integer.parseInt(temp[1]);
            for(int j=0; j<time; j++){
                m++;
                if(m>59){
                    m %= 60;
                    h++;
                }
                if(h>23) h %= 24;
                if(h>=7 && h<19){
                    if(h==7 && m==0){
                        total += 5;
                    }
                    else total += 10;
                }
                else{
                    if(h==19 && m==0) total += 10;
                    else total += 5;
                }
            }
        }
        System.out.println(total);
    }
}
