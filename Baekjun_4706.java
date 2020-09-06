import java.io.*;

public class Baekjun_4706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] in = br.readLine().split(" ");
            double a = Double.parseDouble(in[0]);
            double b = Double.parseDouble(in[1]);
            if(a==0 && b==0) break;
            double v = Math.sqrt(1-Math.pow(b/a, 2));
            System.out.printf("%.3f\n", v);
        }
        br.close();
    }
}
