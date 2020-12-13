import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Baekjun_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<n; i++) list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        for(int i:list) sb.append(i).append("\n");
        System.out.println(sb.toString());
        br.close();
    }
}