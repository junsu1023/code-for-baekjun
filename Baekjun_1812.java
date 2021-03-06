import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] candySum = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            candySum[i] = Integer.parseInt(br.readLine());
            sum += candySum[i];
        }
        sum /= 2;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<n; j+=2){
                temp += candySum[(i+j)%n];
            }
            System.out.println(temp - sum);
        }
        br.close();
    }
}
