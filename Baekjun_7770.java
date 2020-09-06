import java.io.*;

public class Baekjun_7770 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int h = 0;
        int b = 0;
        while(b <= n){
            b += 2*h*h + 2*h + 1;
            h++;
        }
        bw.write(h-1 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
