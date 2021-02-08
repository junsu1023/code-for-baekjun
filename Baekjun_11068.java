import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_11068 {
    public static int[] saveNum = new int[10000000];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n --> 0){
            int isPalindrome = 0;
            int num = Integer.parseInt(br.readLine());
            for(int i=2; i<=64; i++){
                int len = convert(num, i);
                int start = 0;
                int end = len-1;
                if(len % 2== 0){
                    for(int j=0; j<len/2; j++){
                        if(saveNum[start++] == saveNum[end--]) isPalindrome = 1;
                        else{
                            isPalindrome = 0;
                            break;
                        }
                    }
                }
                else{
                    for(int j=0; j<len/2+1; j++){
                        if(saveNum[start++] == saveNum[end--]) isPalindrome = 1;
                        else{
                            isPalindrome = 0;
                            break;
                        }
                    }
                }
                if(isPalindrome != 0) break;
                isPalindrome = 0;

            }
            System.out.println(isPalindrome);
        }
        br.close();
    }
    public static int convert(int num, int base){
        int cnt = 0;
        while(num >= base){
            saveNum[cnt++] = num%base;
            num /= base;
        }
        saveNum[cnt++] = num;
        return cnt;
    }
}
