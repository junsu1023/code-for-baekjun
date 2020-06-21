import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13410 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int max = 0;
        for(int i=1; i<=k; i++){
            int mul = n*i;
            int temp = mul;
            int len = 0;
            int max_temp = 0;
            while(temp>9){
                temp /= 10;
                len++;
            }
            while(mul!=0){
                max_temp += (mul%10) * (int)Math.pow(10, len);
                mul/=10;
                len--;
            }
            if(max_temp > max) max = max_temp;
        }
        bw.write(max + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
