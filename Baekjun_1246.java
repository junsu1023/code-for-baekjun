import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_1246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int customer = Integer.parseInt(st.nextToken());
        int[] price = new int[customer];
        for(int i=0; i<customer; i++){
            price[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(price);
        int result = 0;
        int max = 0;
        int decisionPrice = 0;
        for(int i=0; i<customer; i++){
            if(customer-i < n) result = price[i] * (customer-i);
            else result = price[i] * n;
            if(max < result){
                decisionPrice = price[i];
                max = result;
            }
        }
        System.out.println(decisionPrice + " " + max);
        br.close();
    }
}
