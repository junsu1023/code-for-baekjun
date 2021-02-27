import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjun_11637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++){
            int n = Integer.parseInt(br.readLine());
            int[] vote = new int[n];
            int max = 0;
            int idx = 0;
            int total = 0;
            for(int j=0; j<n; j++){
                vote[j] = Integer.parseInt(br.readLine());
                total += vote[j];
                if(vote[j] > max){
                    max = vote[j];
                    idx = j+1;
                }
            }
            total /= 2;
            Arrays.sort(vote);
            if(vote[n-1] == vote[n-2]) idx = 0;
            boolean majority = true;
            if(vote[n-1] <= total) majority = false;
            if(idx == 0) System.out.println("no winner");
            else{
                if(majority) System.out.println("majority winner " + idx);
                else System.out.println("minority winner " + idx);
            }
        }
        br.close();
    }
}
