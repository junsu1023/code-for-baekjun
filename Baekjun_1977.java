import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Baekjun_1977 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<=100; i++){
            int mul = i*i;
            if(mul>=m && mul<=n) list.add(mul);
        }
        int sum = 0;
        for(int i=0; i<list.size(); i++) sum += list.get(i);
        if(sum == 0) bw.write(-1 + "\n");
        else bw.write(sum + "\n" + list.get(0) + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
