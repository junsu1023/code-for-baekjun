import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_17201 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String mag = br.readLine();
        boolean check = true;
        for(int i=0; i<mag.length()-1; i++){
            if(mag.charAt(i) == mag.charAt(i+1)){
                check = false;
                break;
            }
        }
        if(check) bw.write("Yes\n");
        else bw.write("No\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
