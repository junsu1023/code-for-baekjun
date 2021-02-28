import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_2435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int continuity = Integer.parseInt(st.nextToken());
        int[] temperature = new int[day];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<day; i++) temperature[i] = Integer.parseInt(st.nextToken());
        int[] temperatureSum = new int[day-continuity+1];
        for(int i=0; i<day-continuity+1; i++){
            for(int j=i; j<i+continuity; j++){
                temperatureSum[i] += temperature[j];
            }
        }
        Arrays.sort(temperatureSum);
        System.out.println(temperatureSum[day-continuity]);
        br.close();
    }
}
