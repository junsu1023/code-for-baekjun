import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long start = 0;
        long end = (long)Math.sqrt(n);
        long mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(mid >= Math.sqrt(n)) end = mid - 1;
            else start = mid + 1;
        }
        if(Math.pow(mid, 2) == n) System.out.println(mid);
        else System.out.println(mid+1);
        br.close();
    }
}
