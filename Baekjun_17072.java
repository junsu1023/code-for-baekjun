import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr = new char[n][m];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3 * m; j += 3) {
                int total = 0;
                total += Integer.parseInt(st.nextToken()) * 2126;
                total += Integer.parseInt(st.nextToken()) * 7152;
                total += Integer.parseInt(st.nextToken()) * 722;
                if (total < 510000) sb.append('#');
                else if (total < 1020000) sb.append('o');
                else if (total < 1530000) sb.append('+');
                else if (total < 2040000) sb.append('-');
                else sb.append('.');
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
