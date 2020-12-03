import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_6749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int small = Integer.parseInt(br.readLine());
        int mid = Integer.parseInt(br.readLine());
        int dif = mid - small;
        System.out.println(mid + dif);
        br.close();
    }
}
