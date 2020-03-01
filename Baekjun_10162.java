import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int second = Integer.parseInt(br.readLine());
        int a = second/300;
        second %= 300;
        int b = second/60;
        second %= 60;
        int c = second/10;
        second %= 10;
        if(second != 0) System.out.println(-1);
        else System.out.println(a + " " + b + " " + c);
    }
}
