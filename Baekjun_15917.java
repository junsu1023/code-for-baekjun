import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_15917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if ((num & -num) == num) System.out.println(1);
            else System.out.println(0);
        }
        br.close();
    }
}
