import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2303 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card = new int[5];
        int max = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                card[j] = Integer.parseInt(st.nextToken());
            }
            if(oneDigit(card) >= max){
                max = oneDigit(card);
                index = i+1;
            }
        }
        System.out.println(index);
        br.close();
    }
    public static int oneDigit(int[] card){
        int max = 0;
        int sum = 0;
        int temp = max;
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                for(int k=j+1; k<5; k++){
                    sum = card[i] + card[j] + card[k];
                    sum %= 10;
                    if(sum > max) max = sum;
                }
            }
        }
        return max;
    }
}
