import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1284 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String[] num = br.readLine().split("");
            int count = 1;
            if(Integer.parseInt(num[0]) == 0) break;
            for (int i = 0; i < num.length; i++) {
                if (Integer.parseInt(num[i]) == 1) count += 3;
                else if (Integer.parseInt(num[i]) == 0) count += 5;
                else count += 4;
            }
            System.out.println(count);
        }
    }
}
