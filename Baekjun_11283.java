import java.io.*;

public class Baekjun_11283 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        bw.write((int)word.charAt(0) - 44031 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
