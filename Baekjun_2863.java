import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2863 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");
        int a = Integer.parseInt(n[0]);
        int b = Integer.parseInt(n[1]);
        n = br.readLine().split(" ");
        int c = Integer.parseInt(n[0]);
        int d = Integer.parseInt(n[1]);
        double[] num = {((double)a/c + (double)b/d), ((double)c/d + (double)a/b), ((double)d/b + (double)c/a), ((double)b/a + (double)d/c)};
        double max = 0;
        int count = 0;
        for(int i=0; i<num.length; i++){
            if(num[i] > max) {
                max = num[i];
                count = i;
            }
        }
        System.out.println(count);
    }
}
