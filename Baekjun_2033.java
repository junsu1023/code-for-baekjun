import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_2033 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int temp = 10;
        while(n>temp){
            if(n%temp < temp/2) n -= n%temp;
            else{
                n -= n%temp;
                n += temp;
            }
            temp *= 10;
        }
        bw.write(n + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
