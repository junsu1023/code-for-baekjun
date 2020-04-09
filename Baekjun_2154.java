import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_2154 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String itos =Integer.toString(n);
        for(int i=1; i<=n; i++) sb.append(i);
        int idx = sb.indexOf(itos) + 1;
        bw.write(idx + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
