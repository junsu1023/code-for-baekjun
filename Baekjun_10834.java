import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_10834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int total = 1;
        int spin = 0;
        for(int tc=0; tc<n; tc++){
            String[] in = br.readLine().split(" ");
            int a = Integer.parseInt(in[0]);
            int b = Integer.parseInt(in[1]);
            int kind = Integer.parseInt(in[2]);
            if(kind == 1) spin++;
            total = total/a*b;
        }
        System.out.println((spin%2) + " " + total);
        br.close();
    }
}
