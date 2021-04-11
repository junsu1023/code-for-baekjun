import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17283 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int center = Integer.parseInt(br.readLine());
        int rate = Integer.parseInt(br.readLine());
        int total = 0;
        int n = 2;
        int temp = center;
        while(temp >= 5){
            int length = temp * rate / 100;
            if(length <= 5) break;
            total += (length * n);
            n *= 2;
            temp = length;
        }
        System.out.println(total);
        br.close();
    }
}
