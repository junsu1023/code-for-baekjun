import java.io.*;

public class Baekjun_10798 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] arr = new char[5][15];
        for(int i=0; i<5; i++){
            String in = br.readLine();
            for(int j=0; j<in.length(); j++){
                arr[i][j] = in.charAt(j);
            }
        }
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] == ' ' || arr[j][i] == '\0') continue;
                bw.write(arr[j][i]);
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
