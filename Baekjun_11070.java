import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_11070 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_case = Integer.parseInt(br.readLine());
        for(int tc=0; tc<test_case; tc++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            double[] get_score = new double[n];
            double[] lost_score = new double[n];
            for(int i=0; i<m; i++){
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st2.nextToken());
                int b = Integer.parseInt(st2.nextToken());
                int p = Integer.parseInt(st2.nextToken());
                int q = Integer.parseInt(st2.nextToken());
                get_score[a-1] += p;
                get_score[b-1] += q;
                lost_score[a-1] += q;
                lost_score[b-1] += p;
            }
            double[] value = new double[n];
            for(int i=0; i<n; i++){
                if(get_score[i] == 0 && lost_score[i] == 0) value[i] = 0;
                else value[i] = Math.pow(get_score[i], 2) / (Math.pow(get_score[i], 2) + Math.pow(lost_score[i], 2));
            }
            Arrays.sort(value);
            System.out.println((int)(value[n-1]*1000) + "\n" + (int)(value[0]*1000));
        }
    }
}
