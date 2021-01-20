import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Iterator<Integer> iter = list.iterator();
        list.sort(Collections.reverseOrder());
        while (iter.hasNext()) sb.append(iter.next()).append("\n");
        System.out.println(sb.toString());
        br.close();
    }
}
