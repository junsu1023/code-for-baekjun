import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_21300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int beer = Integer.parseInt(st.nextToken());
        int malt = Integer.parseInt(st.nextToken());
        int wineProduct = Integer.parseInt(st.nextToken());
        int carbonatedSoftDrink = Integer.parseInt(st.nextToken());
        int seltzer = Integer.parseInt(st.nextToken());
        int water = Integer.parseInt(st.nextToken());
        int total = beer * 5 + malt * 5 + wineProduct * 5 + carbonatedSoftDrink * 5 + seltzer * 5 + water * 5;
        System.out.println(total);
        br.close();
    }
}
