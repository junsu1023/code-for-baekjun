import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] split = word.toCharArray();
        char before = split[0];
        int[] cnt = new int[2];
        int count = 0;
        for(int i=1; i<split.length; i++){
            if(before != split[i]){
                cnt[before-48]++;
                before = split[i];
            }
        }
        cnt[before-48]++;
        System.out.println(Math.min(cnt[0], cnt[1]));
        br.close();
    }
}
