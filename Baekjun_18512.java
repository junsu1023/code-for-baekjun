import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_18512 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        boolean check = false;
        for(int i=0; i<=100; i++){
            int temp = i*x+p1;
            for(int j=0; j<=100; j++){
                if(temp == (j*y+p2)){
                    check = true;
                    System.out.println(temp);
                    break;
                }
            }
            if(check) break;
        }
        if(!check) System.out.println(-1);
    }
}
