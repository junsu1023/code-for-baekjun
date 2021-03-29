import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1544 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        for(int i=0; i<n; i++) word[i] = br.readLine();
        String[] connectWord = new String[n];
        boolean[] check = new boolean[n];
        for(int i=0; i<n; i++) connectWord[i] = word[i] + word[i];
        int cnt = 0;
        while(true){
            for(int i=0; i<n; i++){
                if(!check[i]) {
                    check[i] = true;
                    for (int j = i + 1; j < n; j++) {
                        if (!check[j]) {
                            if (connectWord[j].contains(word[i]) && connectWord[i].length() == connectWord[j].length()) check[j] = true;
                        }
                    }
                    cnt++;
                }
            }
            boolean check2 = true;
            for(int i=0; i<n; i++){
                if(!check[i]){
                    check2 = false;
                    break;
                }
            }
            if(check2){
                System.out.println(cnt);
                break;
            }
        }
        br.close();
    }
}
