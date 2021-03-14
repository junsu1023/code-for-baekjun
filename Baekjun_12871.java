import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_12871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        int totalLength = LCM(s.length(), t.length());
        String totalS = s;
        String totalT = t;
        while(totalS.length() != totalLength) totalS += s;
        while(totalT.length() != totalLength) totalT += t;
        if(totalS.equals(totalT)) System.out.println(1);
        else System.out.println(0);
        br.close();
    }
    public static int GCD(int a, int b){
        while(b > 0){
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
    public static int LCM(int a, int b){
        return (a * b) / GCD(a, b);
    }
}
