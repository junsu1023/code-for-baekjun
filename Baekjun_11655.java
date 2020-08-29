import java.io.*;

public class Baekjun_11655 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String word = br.readLine();
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                if((int)word.charAt(i) + 13 > 90) sb.append((char)(word.charAt(i) + 13 - 26));
                else sb.append((char)(word.charAt(i)+13));
            }
            else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                if((int)word.charAt(i) + 13 > 122) sb.append((char)(word.charAt(i) + 13 - 26));
                else sb.append((char)(word.charAt(i)+13));
            }
            else sb.append(word.charAt(i));
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
