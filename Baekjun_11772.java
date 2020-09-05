import java.io.*;

public class Baekjun_11772 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(br.readLine());
        int total = 0;
        for(int i=0; i<test; i++){
            int n = Integer.parseInt(br.readLine());
            total += (int)Math.pow(n/10, n%10);
        }
        bw.write(total + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
