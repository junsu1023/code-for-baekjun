import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_16481 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double r1 = Double.parseDouble(st.nextToken());
        double r2 = Double.parseDouble(st.nextToken());
        double r3 = Double.parseDouble(st.nextToken());
        System.out.println((r1*r2*r3)/(r1*r2 + r2*r3 + r3*r1));
    }
}
