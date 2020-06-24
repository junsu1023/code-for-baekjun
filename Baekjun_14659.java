import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_14659 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n-1];
        int[] height = new int[n];
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for(int j=i; j<n; j++){
                if(height[i] < height[j]) break;
                if(height[i] > height[j]) cnt[i]++;
            }
        }
        Arrays.sort(cnt);
        System.out.println(cnt[cnt.length-1]);
    }
}
