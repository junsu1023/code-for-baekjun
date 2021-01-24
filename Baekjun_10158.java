import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int posX = Integer.parseInt(st.nextToken());
        int posY = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        int x = (posX + time) % (2 * row);
        int y = (posY + time) % (2 * col);
        StringBuilder sb = new StringBuilder();
        sb.append(row - Math.abs(row - x)).append(" ").append(col - Math.abs(col - y));
        System.out.println(sb.toString());
        br.close();
    }
}
