import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_18245 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int jump = 2;
        while(true){
            String s = br.readLine();
            if(s.equals("Was it a cat I saw?")) break;
            for(int i=0; i<s.length(); i+=jump){
                sb.append(s.charAt(i));
            }
            sb.append("\n");
            jump++;
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
