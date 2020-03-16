import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_5565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_price = Integer.parseInt(br.readLine());
        int[] book_price = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            book_price[i] = Integer.parseInt(br.readLine());
            sum += book_price[i];
        }
        int rest_price = total_price - sum;
        System.out.println(rest_price);
    }
}
