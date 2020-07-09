import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_18238 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int time = 0;
        char pos = 'A';
        for(int i=0; i<s.length(); i++){
            int case1 = (int)pos - (int)s.charAt(i);
            if(case1 < 0) case1 += 26;
            int case2 = (int)s.charAt(i) - (int)pos;
            if(case2 < 0) case2 += 26;
            time += Math.min(case1, case2);
            pos = s.charAt(i);
        }
        System.out.println(time);
    }
}
