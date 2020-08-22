import java.io.*;

public class Baekjun_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        String[] rev = new String[n];
        for(int i=0; i<n; i++){
            word[i] = br.readLine();
            String s = "";
            for(int j=0; j<word[i].length(); j++){
                s += word[i].charAt(word[i].length()-j-1);
                rev[i] = s;
            }
        }
        String pw = "";
        for(int i=0; i<word.length; i++){
            for(int j=0; j<rev.length; j++){
                if(word[i].equals(rev[j])){
                    pw = word[i];
                    break;
                }
            }
        }
        int len = pw.length();
        int idx = pw.length()/2;
        bw.write(len + " " + pw.charAt(idx));
        bw.flush();
        br.close();
        bw.close();
    }
}
