import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_12836 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] n = br.readLine().split(" ");
        int n1 = Integer.parseInt(n[0]);
        int n2 = Integer.parseInt(n[1]);
        long[] m = new long[n1+1];
        for(int i=0; i<n2; i++){
            String[] input = br.readLine().split(" ");
            int p1 = Integer.parseInt(input[0]);
            int p2 = Integer.parseInt(input[1]);
            long p3 = Long.parseLong(input[2]);
            long total = 0;
            if(p1==1)   m[p2] += p3;
            else if(p1==2){
                for(int j=p2; j<=p3; j++) total += m[j];
                bw.write(total + "\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
