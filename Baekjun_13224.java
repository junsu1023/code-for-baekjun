import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13224 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] c = {1, 0, 0};
        String in = br.readLine();
        for(int i=0; i<in.length(); i++){
            if(in.charAt(i)=='A'){
                int temp = c[0];
                c[0] = c[1];
                c[1] = temp;
            }
            else if(in.charAt(i)=='B'){
                int temp = c[1];
                c[1] = c[2];
                c[2] = temp;
            }
            else{
                int temp = c[2];
                c[2] = c[0];
                c[0] = temp;
            }
        }
        for(int i=0; i<3; i++){
            if(c[i] == 1) bw.write(i+1 + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
