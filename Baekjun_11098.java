import java.io.*;

public class Baekjun_11098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            int n = Integer.parseInt(br.readLine());
            long[] c = new long[n];
            String[] name = new String[n];
            for(int i=0; i<n; i++){
                String[] in = br.readLine().split(" ");
                c[i] = Long.parseLong(in[0]);
                name[i] = in[1];
            }
            long max = 0;
            int idx = 0;
            for(int i=0; i<n; i++){
                if(c[i] > max){
                    max = c[i];
                    idx = i;
                }
            }
            bw.write(name[idx] + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
