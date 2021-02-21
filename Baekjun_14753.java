import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_14753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        System.out.println(max(num));
        br.close();
    }
    public static int max(int[] num){
        int len = num.length;
        int[] test = new int[7];
        test[0] = num[0] * num[len-1];
        test[1] = num[len-1] * num[len-2];
        test[2] = num[0] * num[1];
        test[3] = num[len-1] * num[len-2] * num[len-3];
        test[4] = num[0] * num[1] * num[2];
        test[5] = num[0] * num[len-1] * num[len-2];
        test[6] = num[0] * num[1] * num[len-1];
        Arrays.sort(test);
        return test[6];
    }
}
