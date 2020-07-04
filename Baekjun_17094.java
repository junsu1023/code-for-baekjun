import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_17094 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int two = 0;
        int alpha_e = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='2') two++;
            else alpha_e++;
        }
        if(two > alpha_e) bw.write(2 + "\n");
        else if(two < alpha_e) bw.write("e\n");
        else bw.write("yee\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
