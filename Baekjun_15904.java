import java.io.*;

public class Baekjun_15904 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        char[] alpha = {'U', 'C', 'P', 'C'};
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == alpha[idx]) idx++;
            if(idx == 4) break;
        }
        if(idx == 4) bw.write("I love UCPC\n");
        else bw.write("I hate UCPC\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
