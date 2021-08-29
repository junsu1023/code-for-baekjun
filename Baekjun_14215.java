import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjun_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++) list.add(Integer.parseInt(st.nextToken()));
        Collections.sort(list);
        int result;
        if(list.get(2) < list.get(0) + list.get(1)) result = list.get(0) + list.get(1) + list.get(2);
        else result = list.get(0) + list.get(1) + (list.get(0) + list.get(1) - 1);
        System.out.println(result);
        br.close();
    }
}