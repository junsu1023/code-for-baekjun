import java.io.*;

public class Baekjun_2954 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        for(int i=0; i<line.length(); i++){
            sb.append(line.charAt(i));
            if(line.charAt(i)=='a' || line.charAt(i)=='e' || line.charAt(i)=='u' || line.charAt(i)=='i' || line.charAt(i)=='o') i+=2;
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
