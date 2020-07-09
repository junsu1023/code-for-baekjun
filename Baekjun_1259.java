import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_1259 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String s = br.readLine();
            if(s.equals("0")) break;
            int mid = s.length()/2;
            boolean check = true;
            for(int i=0; i<mid; i++){
                if(s.charAt(i) != s.charAt(s.length()-i-1)) check = false;
            }
            if(check) bw.write("yes\n");
            else bw.write("no\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
