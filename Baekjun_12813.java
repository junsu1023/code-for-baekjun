import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_12813 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int[] bi1 = new int[100001];
        int[] bi2 = new int[100001];
        String n1 = br.readLine();
        String n2 = br.readLine();
        for(int i=0; i<n1.length(); i++){
            bi1[i] = n1.charAt(i)-'0';
            bi2[i] = n2.charAt(i)-'0';
        }
        for(int i=0; i<n1.length(); i++){
            sb.append(bi1[i]&bi2[i]);
        }
        sb.append("\n");
        for(int i=0; i<n1.length(); i++){
            sb.append(bi1[i]|bi2[i]);
        }
        sb.append("\n");
        for(int i=0; i<n1.length(); i++){
            sb.append(bi1[i]^bi2[i]);
        }
        sb.append("\n");
        for(int i=0; i<n1.length(); i++){
            sb.append(bi1[i]^1);
        }
        sb.append("\n");
        for(int i=0; i<n1.length(); i++){
            sb.append(bi2[i]^1);
        }
        sb.append("\n");
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }

}
