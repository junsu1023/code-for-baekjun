import java.io.*;

public class Baekjun_9625 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a_cnt = 1;
        int b_cnt = 0;
        int temp = 0;
        int i=0;
        while(i!=n){
            temp = a_cnt;
            a_cnt = b_cnt;
            b_cnt += temp;
            i++;
        }
        bw.write(a_cnt + " " + b_cnt);
        bw.flush();
        br.close();
        bw.close();
    }
}
