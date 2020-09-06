import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14614 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        String c = st.nextToken();
        long total = 0;
        if((c.charAt(c.length()-1)-'0')%2==0) System.out.println(a);
        else {
            total = a^b;
            System.out.println(total);
        }
        br.close();
    }
}
