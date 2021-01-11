import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int rock = Integer.parseInt(br.readLine());
        System.out.println(rock%2==0 ? "CY" : "SK");
        br.close();
    }
}
