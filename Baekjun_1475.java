import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomNumber = Integer.parseInt(br.readLine());
        int[] check = new int[10];
        while(true){
            check[roomNumber%10]++;
            if(roomNumber / 10 == 0) break;
            roomNumber /= 10;
        }
        int num = 0;
        for(int i=0; i<10; i++){
            if(i != 6 && i != 9) num = Math.max(num, check[i]);
        }
        int result = Math.max(num, (check[6] + check[9] + 1) / 2);
        System.out.println(result);
        br.close();
    }
}
