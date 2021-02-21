import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int fruit = Integer.parseInt(st.nextToken());
        int snakebird = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] height = new int[fruit];
        for(int i=0; i<fruit; i++) height[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(height);
        for(int i=0; i<fruit; i++){
            if(height[i] <= snakebird) snakebird++;
        }
        System.out.println(snakebird);
        br.close();
    }
}
