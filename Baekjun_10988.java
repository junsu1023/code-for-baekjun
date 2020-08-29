import java.io.*;

public class Baekjun_10988 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        boolean flag = true;
        for(int i=0; i<word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)) flag = false;
        }
        if(flag) bw.write("1");
        else bw.write("0");
        bw.flush();
        br.close();
        bw.close();
    }
}
