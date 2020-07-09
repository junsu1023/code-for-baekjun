import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_18406 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split("");
        int mid = s.length/2;
        int lsum = 0;
        int rsum = 0;
        for(int i=0; i<mid; i++) lsum += Integer.parseInt(s[i]);
        for(int i=mid; i<s.length; i++) rsum += Integer.parseInt(s[i]);
        System.out.println((lsum == rsum ? "LUCKY" : "READY"));
    }
}
