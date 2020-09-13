import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_9047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            int cnt = 0;
            while(num != 6174) {
                num = big(num) - small(num);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
    public static int big(int n){
        int[] arr = {0, 0, 0, 0};
        int i=0;
        while(n!=0){
            arr[i++] = n%10;
            n/=10;
        }
        int t = 0;
        for(i=0; i<4; i++){
            for(int j=i; j<4; j++){
                if(arr[i] < arr[j]){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
    }
    public static int small(int n){
        int[] arr = {0, 0, 0, 0};
        int i = 0;
        while(n!=0){
            arr[i++] = n%10;
            n/=10;
        }
        int t = 0;
        for(i=0; i<4; i++){
            for(int j=i; j<4; j++){
                if(arr[i] > arr[j]){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
    }
}
