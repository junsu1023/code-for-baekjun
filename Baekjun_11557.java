import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjun_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int tc=0; tc<testCase; tc++){
            int num = Integer.parseInt(br.readLine());
            Map<String, Integer> information = new HashMap<>();
            for(int i=0; i<num; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                information.put(st.nextToken(), Integer.parseInt(st.nextToken()));
            }
            String where = "";
            int max = 0;
            for(Map.Entry<String, Integer> entry : information.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    where = entry.getKey();
                }
            }
            System.out.println(where);
        }
        br.close();
    }
}
