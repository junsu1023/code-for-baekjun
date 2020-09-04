import java.io.*;

public class Baekjun_2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        long a = Long.parseLong(in[0]);
        long b = Long.parseLong(in[1]);
        if(a<=b) System.out.println((b-a+1)*(b+a)/2);
        else System.out.println((a-b+1)*(b+a)/2);
        br.close();
    }
}
