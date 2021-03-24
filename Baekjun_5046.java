import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_5046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int participant = Integer.parseInt(st.nextToken());
        int budget = Integer.parseInt(st.nextToken());
        int hotel = Integer.parseInt(st.nextToken());
        int week = Integer.parseInt(st.nextToken());
        int min = budget + 1;
        for(int i=0; i<hotel; i++){
            int hotelPrice = Integer.parseInt(br.readLine());
            int expend = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<week; j++){
                int possiblePerson = Integer.parseInt(st.nextToken());
                if(possiblePerson >= participant){
                    expend = participant * hotelPrice;
                }
            }
            if(min > expend && expend != 0) min = expend;
        }
        if(min > budget) System.out.println("stay home");
        else System.out.println(min);
        br.close();
    }
}
