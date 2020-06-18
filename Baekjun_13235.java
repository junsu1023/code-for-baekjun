import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13235 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(int i=input.length()-1; i>=0; i--) sb.append(input.charAt(i));
        if(input.equals(sb.toString())) bw.write("true");
        else bw.write("false");
        bw.flush();
        br.close();
        bw.close();
    }
}
