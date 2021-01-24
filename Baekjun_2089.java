import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        if(n==0) System.out.println(0);
        while(n != 0){
            if(n%-2==0){
                sb.append(0);
                n /= -2;
            }
            else{
                sb.append(1);
                n = (n-1) / -2;
            }
        }
        System.out.println(sb.reverse().toString());
        br.close();
    }
}
