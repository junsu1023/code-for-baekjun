import java.io.*;

public class Baekjun_17249 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] taebo = br.readLine().split("(\\^0\\^)");
        String[] fist = new String[2];
        int lf = 0;
        int rf = 0;
        for(int i=0; i<taebo[0].length(); i++){
            if(taebo[0].charAt(i)=='@') lf++;
        }
        for(int i=0; i<taebo[1].length(); i++){
            if(taebo[1].charAt(i)=='@') rf++;
        }
        bw.write(lf + " " + rf + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
