import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_21312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] juice = new int[3];
        boolean odd = false;
        for(int i=0; i<3; i++){
            juice[i] = Integer.parseInt(st.nextToken());
            if(juice[i] % 2 != 0) odd = true;
        }
        int ans = 1;
        if(odd){
            for(int i=0; i<3; i++){
                if(juice[i] % 2 != 0) ans *= juice[i];
            }
        }
        else ans = juice[0] * juice[1] * juice[2];
        System.out.println(ans);
        br.close();
    }
}
