import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_16968 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int total = 1;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='d'){
                if(i==0) total *= 10;
                else{
                    if(input.charAt(i-1)=='d') total *= 9;
                    else total *= 10;
                }
            }
            else if(input.charAt(i)=='c'){
                if(i==0) total *= 26;
                else{
                    if(input.charAt(i-1)=='c') total *= 25;
                    else total *= 26;
                }
            }
        }
        bw.write(total + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
