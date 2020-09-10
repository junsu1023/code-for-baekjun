import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_14726 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            StringBuilder sb = new StringBuilder();
            sb.append(br.readLine());
            int total = 0;
            String s = sb.reverse().toString();
            for(int i=0; i<s.length(); i++){
                if(i%2==0) total += (s.charAt(i) - '0');
                else{
                    int temp = (s.charAt(i) - '0') * 2;
                    int a = 0;
                    if(temp >= 10) {
                        a += (temp/10 + temp%10);
                        total += a;
                    }
                    else total += temp;
                }
            }
            if(total % 10 == 0) System.out.println("T");
            else System.out.println("F");
        }
    }
}
