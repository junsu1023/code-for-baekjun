import java.io.*;

public class Baekjun_14624 {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double ans = (double)n * (double)n * 1.7320508075689 / 4;
        bw.write(ans + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
