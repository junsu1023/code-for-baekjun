import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_1032 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        boolean check = false;
        for(int i=0; i<n; i++) s[i] = br.readLine();
        for(int i=0; i<s[0].length(); i++){
            for(int j=0; j<n-1; j++){
                if(s[j].charAt(i) != s[j+1].charAt(i)){
                    check = true;
                    break;
                }
            }
            if(check){
                sb.append("?");
                check = false;
            }
            else sb.append(s[0].charAt(i));
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
