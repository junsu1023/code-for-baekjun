import java.io.*;

public class Baekjun_13301 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(br.readLine());
        long[] arr = new long[101];
        arr[0] = 1; arr[1] = 1;
        for(int i=2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        long parameter = 2*arr[(int)n] + 2*arr[(int)n-1];
        bw.write(parameter + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
