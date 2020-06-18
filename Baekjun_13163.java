import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13163 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            sb.append("god");
            for(int j=1; j<input.length; j++){
                sb.append(input[j]);
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
