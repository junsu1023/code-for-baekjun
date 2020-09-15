import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_17202 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("");
        String[] b = br.readLine().split("");
        String[] ar = new String[16];
        for(int i=0; i<16; i+=2){
            ar[i] = a[i/2];
            ar[i+1] = b[i/2];
        }
        String s = "";
        String temp = "";
        for(int i=0; i<16; i++) s += ar[i];
        while(s.length()!=2){
            for(int i=0; i<s.length()-1; i++){
                temp = temp + Integer.toString(((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10);
            }
            s = temp;
            temp = "";
        }
        System.out.println(s);
        br.close();
    }
}
