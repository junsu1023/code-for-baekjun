import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String check = st.nextToken();
            if(check.equals("enter")) set.add(name);
            else if(check.equals("leave")) set.remove(name);
        }
        List<String> list = new LinkedList<>(set);
        list.sort(Collections.reverseOrder());
        for(String i : list) System.out.println(i);
        br.close();
    }
}
