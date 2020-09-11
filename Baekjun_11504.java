import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_11504 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            List<Integer> list = new ArrayList();
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            int x = 0, y = 0;
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++) x = x * 10 + Integer.parseInt(st2.nextToken());
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int i=0; i<m; i++) y = y * 10 + Integer.parseInt(st3.nextToken());
            StringTokenizer st4 = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) list.add(Integer.parseInt(st4.nextToken()));
            int cnt = 0;
            for(int i=0; i<n; i++){
                int temp = 0;
                for(int j=i; j<i+m; j++){
                    temp = temp * 10 + list.get(j);
                }
                list.add(list.get(i));
                if(temp >= x && temp <= y) cnt++;
            }
            System.out.println(cnt);
        }
        br.close();
    }
}
