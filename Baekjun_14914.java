import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjun_14914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int apple = Integer.parseInt(st.nextToken());
        int banana = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=Math.min(apple, banana); i++){
            if(apple%i==0 && banana%i==0) list.add(i);
        }
        for(int i=0; i<list.size(); i++) System.out.println(list.get(i) + " " + apple/list.get(i) + " " + banana/list.get(i));
        br.close();
    }
}
