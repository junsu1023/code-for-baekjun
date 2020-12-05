import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjun_2358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x_pos = Integer.parseInt(st.nextToken());
            int y_pos = Integer.parseInt(st.nextToken());
            if(x.containsKey(x_pos)) x.put(x_pos, x.get(x_pos)+1);
            else x.put(x_pos, 1);
            if(y.containsKey(y_pos)) y.put(y_pos, y.get(y_pos)+1);
            else y.put(y_pos, 1);
        }
        int cnt = 0;
        for(int key:x.keySet()){
            if(x.get(key) > 1) cnt++;
        }
        for(int key:y.keySet()){
            if(y.get(key) > 1) cnt++;
        }
        System.out.println(String.valueOf(cnt));
        br.close();
    }
}
