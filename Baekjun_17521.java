import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_17521 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        long initialCoin = Integer.parseInt(st.nextToken());
        int[] coinPrice = new int[day];
        long coin = 0;
        for(int i=0; i<day; i++) coinPrice[i] = Integer.parseInt(br.readLine());
        for(int i=0; i<day-1; i++){
            if(coinPrice[i] < coinPrice[i+1]){
                if(initialCoin >= coinPrice[i]){
                    coin += initialCoin / coinPrice[i];
                    initialCoin %= coinPrice[i];
                }
            }
            else if(coinPrice[i] > coinPrice[i+1]){
                initialCoin += coin * coinPrice[i];
                coin = 0;
            }
        }
        initialCoin += coin * coinPrice[day-1];
        System.out.println(initialCoin);
        br.close();
    }
}
