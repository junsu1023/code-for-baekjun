import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baekjun_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int num = 1;
        int count = 0;
        for(int i=0; i<1000; i++){
            list.add(num);
            count++;
            if(num == count){
                num++;
                count = 0;
            }
        }
        int result = 0;
        for(int i=start-1; i<end; i++){
            result += list.get(i);
        }
        System.out.println(result);
        br.close();
    }
}
