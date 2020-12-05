import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17211 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int mood = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Double gg = Double.parseDouble(st.nextToken());
        Double gb = Double.parseDouble(st.nextToken());
        Double bg = Double.parseDouble(st.nextToken());
        Double bb = Double.parseDouble(st.nextToken());
        double[][] per = new double[2][day];
        if(mood == 0){
            per[0][0] = gg;
            per[1][0] = gb;
        }
        else{
            per[0][0] = bg;
            per[1][0] = bb;
        }
        int idx = 1;
        while(idx != day){
            per[0][idx] = per[0][idx-1]*gg + per[1][idx-1]*bg;
            per[1][idx] = per[0][idx-1]*gb + per[1][idx-1]*bb;
            idx++;
        }
        System.out.println(Math.round(per[0][day-1]*1000) + "\n" + Math.round(per[1][day-1]*1000));
        br.close();
    }
}
