import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_2393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);
            System.out.println(list.get(list.size()-3));
        }
        br.close();
    }
}
