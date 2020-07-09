import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_1356 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] s = input.split("");
        int len = s.length;
        int m1 = 1;
        int m2 = 1;
        String check = "NO";
        for(int i=0; i<len-1; i++){
            m1 *= Integer.parseInt(s[i]);
            for(int j=i+1; j<len; j++){
                m2 *= Integer.parseInt(s[j]);
            }
            if(m1==m2){
                check = "YES";
                break;
            }
            m2 = 1;
        }
        bw.write(check + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
