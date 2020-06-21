import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13419 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String word = br.readLine();
            StringBuilder a = new StringBuilder();
            StringBuilder b = new StringBuilder();
            if(word.length() % 2 != 0) word += word;
            for(int j=0; j<word.length(); j++){
                if(j%2==0) a.append(word.charAt(j));
                else b.append(word.charAt(j));
            }
            bw.write(a.toString() + "\n");
            bw.write(b.toString() + "\n");
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
