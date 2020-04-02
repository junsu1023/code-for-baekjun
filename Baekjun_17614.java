import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjun_17614 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int clap = 0;
        int check = 0;
        for(int i=1; i<=n; i++){
            check = i;
            while(check!=0){
                if(check%10==3 || check%10==6 || check%10==9) clap++;
                check/=10;
            }
        }
        System.out.println(clap);
        br.close();
    }
}
