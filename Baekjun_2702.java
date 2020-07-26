import java.io.*;

public class Baekjun_2702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int k = GCD(a, b);
            System.out.println(a*b/k + " " + k);
        }
    }
    public static int GCD(int a, int b){
        if(a%b==0) return b;
        return GCD(b, a%b);
    }
}
