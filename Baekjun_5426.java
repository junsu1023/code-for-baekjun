import java.io.*;

public class Baekjun_5426 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int tc=0; tc<n; tc++){
            String s = br.readLine();
            int len = (int)Math.sqrt(s.length());
            char[][] arr = new char[101][101];
            for(int i=0; i<len; i++){
                for(int j=0; j<len; j++){
                    arr[i][j] = s.charAt(len*i+j);
                }
            }
            for(int i=0; i<len; i++){
                for(int j=0; j<len; j++){
                    bw.write(arr[j][len-i-1]);
                }
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
