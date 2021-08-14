import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_19698 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cow = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        int possible = (weight/size) * (height/size);
        System.out.println(Math.min(possible, cow));
        br.close();
    }
}
