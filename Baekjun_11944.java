import java.io.*;

public class Baekjun_11944 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        for(int i=0; i<n; i++){
            for(int j=0; j<in[0].length(); j++){
                if(m==0){
                    i = n;
                    break;
                }
                bw.write(in[0].charAt(j));
                m--;
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
