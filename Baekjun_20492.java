import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int reward = Integer.parseInt(br.readLine());
        double case1 = reward - reward * 0.22;
        double case2 = reward - reward * 0.2 * 0.22;
        System.out.println((int)case1 + " " + (int)case2);
        br.close();
    }
}
