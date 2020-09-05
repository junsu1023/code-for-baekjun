import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1837 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String p = st.nextToken();
        int k = Integer.parseInt(st.nextToken());
        String ans = "";
        boolean[] primes = new boolean[k+1];
        primes[1] = true;
        for(int i=2; i<k; i++){
            if(primes[i]) continue;
            if(check(i, p)){
                ans = "BAD " + i;
                break;
            }
            for(int j=i+i; j<k; j+=i){
                primes[j] = true;
            }
        }
        if(ans.equals("")) ans = "GOOD";
        System.out.println(ans);
        br.close();
    }
    public static boolean check(int x, String p){
        int ret = 0;
        char[] arr = p.toCharArray();
        for(int i=0; i<arr.length; i++){
            ret = (ret * 10 + (arr[i] - '0')) % x;
        }
        if(ret == 0) return true;
        else return false;
    }
}
