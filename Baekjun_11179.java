import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11179 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%2);
            n/=2;
        }
        String[] rev = sb.toString().split("");
        int total = 0;
        for(int i=0; i<rev.length; i++) total += Integer.parseInt(rev[rev.length-i-1]) * (int)Math.pow(2, i);
        System.out.println(total);
        br.close();
    }
}
