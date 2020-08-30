import java.io.*;

public class Baekjun_10829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            sb.append(n%2);
            n/=2;
        }
        bw.write(sb.reverse().toString() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
