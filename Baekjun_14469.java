import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_14469 {
    static Cow[] cows;
    public static class Cow implements Comparable<Cow>{
        int arrive;
        int check;
        public Cow(int arrive, int check){
            this.arrive = arrive;
            this.check = check;
        }
        @Override
        public int compareTo(Cow o) {
            return Integer.compare(this.arrive, o.arrive);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cows = new Cow[n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cows[i] = new Cow(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(cows);
        int time = cows[0].arrive;
        for(int i=0; i<n; i++){
            if(time < cows[i].arrive) time = cows[i].arrive;
            time += cows[i].check;
        }
        System.out.println(time);
        br.close();
    }
}
