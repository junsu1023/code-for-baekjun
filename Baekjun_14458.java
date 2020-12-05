import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_14458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] alpha = new int[26][2];
        char[] cow_move = br.readLine().toCharArray();
        for(int i=0; i<cow_move.length; i++){
            int idx = cow_move[i] - 'A';
            if(alpha[idx][0]==0) alpha[idx][0] = i+1;
            else alpha[idx][1] = i+1;
        }
        int cnt = 0;
        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){
                if(alpha[i][0]<alpha[j][0] && alpha[j][0] < alpha[i][1] && alpha[i][1] < alpha[j][1]) cnt++;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}
