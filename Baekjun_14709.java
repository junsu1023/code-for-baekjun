import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14709 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[5];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int min = Math.min(first, second);
            int max = Math.max(first, second);
            if(min == 1 && max == 3) check[0] = true;
            else if(min == 1 && max == 4) check[1] = true;
            else if(min == 3 && max == 4) check[2] = true;
            else if(min == 1 && (max == 2 || max == 5)) check[3] = true;
            else if(min == 3 && (max == 2 || max == 5)) check[4] = true;
        }
        boolean fox = true;
        for(int i=0; i<3; i++){
            if(!check[i]){
                fox = false;
                break;
            }
        }
        for(int i=3; i<5; i++){
            if(check[i]){
                fox = false;
                break;
            }
        }
        if(fox) System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
        else System.out.println("Woof-meow-tweet-squeek");
        br.close();
    }
}
