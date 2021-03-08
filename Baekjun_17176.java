import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjun_17176 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] num = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<len; i++) num[i] = Integer.parseInt(st.nextToken());
        String originWord = br.readLine();
        int[] change = new int[len];
        for(int i=0; i<originWord.length(); i++){
            if(originWord.charAt(i) == ' ') change[i] = 0;
            else if(originWord.charAt(i) >= 'a' && originWord.charAt(i) <= 'z') change[i] = (int)originWord.charAt(i) - 70;
            else change[i] = (int)originWord.charAt(i) - 64;
        }
        Arrays.sort(num);
        Arrays.sort(change);
        boolean check = true;
        for(int i=0; i<len; i++){
            if(num[i] != change[i]){
                check = false;
                break;
            }
        }
        if(check) System.out.println("y");
        else System.out.println("n");
        br.close();
    }
}
