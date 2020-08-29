import java.io.*;

public class Baekjun_11586 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[][] mirror = new char[n][n];
        for(int i=0; i<n; i++){
            String in = br.readLine();
            for(int j=0; j<n; j++){
                mirror[i][j] = in.charAt(j);
            }
        }
        int k = Integer.parseInt(br.readLine());
        if(k%3==0){
            for(int i=n-1; i>=0; i--){
                for(int j=0; j<n; j++){
                    bw.write(mirror[i][j]);
                }
                bw.write("\n");
            }
        }
        else if(k%3==1){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    bw.write(mirror[i][j]);
                }
                bw.write("\n");
            }
        }
        else if(k%3==2){
            for(int i=0; i<n; i++){
                for(int j=n-1; j>=0; j--){
                    bw.write(mirror[i][j]);
                }
                bw.write("\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
