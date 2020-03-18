import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_6378 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String[] n = br.readLine().split("");
            if(n[0].equals("0")) break;
            int sum = 10;
            while (sum >= 10) {
                sum = 0;
                for (int i = 0; i < n.length; i++) sum += Integer.parseInt(n[i]);
                n = String.valueOf(sum).split("");
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb.toString());
    }
}
