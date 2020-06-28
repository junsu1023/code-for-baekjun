import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_15351 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String name = br.readLine();
            int total = 0;
            for(int j=0; j<name.length(); j++){
                if(name.charAt(j)>=65 && name.charAt(j)<=90)   total += name.charAt(j)-64;
            }
            if(total==100) bw.write("PERFECT LIFE\n");
            else bw.write(total + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
