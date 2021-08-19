import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_19572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] area = new double[3];
        for(int i=0; i<3; i++) area[i] = Double.parseDouble(st.nextToken());
        double a = (area[0] + area[1] - area[2]) / 2;
        double c = area[1] - a;
        double b = area[2] - c;
        if(a<=0 || b<=0 || c<=0) System.out.println(-1);
        else{
            System.out.println(1);
            System.out.println(a + " " + b + " " + c);
        }
        br.close();
    }
}
