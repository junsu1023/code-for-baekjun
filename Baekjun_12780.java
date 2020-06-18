import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_12780 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String h = br.readLine();
        String w = br.readLine();
        int l = h.length() - w.length();
        int cnt = 0;
        for(int i=0; i<l+1; i++){
            String cut = h.substring(i, i+w.length());
            if(cut.equals(w)) cnt++;
        }
        System.out.println(cnt);
    }

}
