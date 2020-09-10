import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_8595 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String s = br.readLine();
        long sum = 0, num = 0, temp = 0, j = 1;
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                num = s.charAt(i) - '0';
                sum += j * num;
                j *= 10;
            }
            if(i == 0 || s.charAt(i) <'0' || s.charAt(i) >'9'){
                if(sum <= 999999){
                    temp += sum;
                    sum = 0;
                    j = 1;
                }
            }
        }
        System.out.println(temp);
        br.close();
    }
}
