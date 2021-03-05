import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjun_11536 {
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        List<String> increase = new ArrayList<>();
        List<String> decrease = new ArrayList<>();
        for(int i=0; i<n; i++) list.add(br.readLine());
        for(int i=0; i<n; i++){
            increase.add(list.get(i));
            decrease.add(list.get(i));
        }
        Collections.sort(increase);
        decrease.sort(Collections.reverseOrder());
        String result = "";
        boolean check1 = true;
        boolean check2 = true;
        for(int i=0; i<n; i++){
            if(list.get(i) != increase.get(i)){
                check1 = false;
                break;
            }
        }
        for(int i=0; i<n; i++){
            if(list.get(i) != decrease.get(i)){
                check2 = false;
                break;
            }
        }
        if(check1) System.out.println("INCREASING");
        else if(check2) System.out.println("DECREASING");
        else System.out.println("NEITHER");
        br.close();
    }
}
