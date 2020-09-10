import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2828 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        int move = 0, l = 0, r = m-1;
        for(int i=0; i<k; i++){
            int temp = Integer.parseInt(br.readLine()) - 1;
            if(temp > r){
                move += temp - r;
                r = temp;
                l = temp - (m - 1);
            }
            else if(temp < l){
                move += l - temp;
                l = temp;
                r = temp + (m - 1);
            }
        }
        System.out.println(move);
        br.close();
    }
}
