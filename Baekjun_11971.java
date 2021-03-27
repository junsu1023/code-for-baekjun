import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_11971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] standard = new int[101];
        int distance = 0;
        int interval = 1;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int km = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());
            distance += km;
            for(int j=interval; j<=distance; j++) standard[j] = speed;
            interval += km;
        }
        standard[0] = standard[1];
        distance = 0;
        interval = 1;
        int[] check = new int[101];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int km = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());
            distance += km;
            for(int j=interval; j<=distance; j++) check[j] = speed;
            interval += km;
        }
        check[0] = check[1];
        int max = 0;
        int over = 0;
        for(int i=0; i<101; i++){
            if(check[i]>standard[i]) over = check[i] - standard[i];
            max = Math.max(max, over);
        }
        System.out.println(max);
        br.close();
    }
}
