import java.util.Scanner;

public class Baekjun_1233 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int[] cnt = new int[81];
        for(int i=1; i<=s1; i++){
            for(int j=1; j<=s2; j++){
                for(int k=1; k<=s3; k++){
                    cnt[i+j+k]++;
                }
            }
        }
        int max = 0;
        int ans = 0;
        for(int i=1; i<=80; i++){
            if(max < cnt[i]){
                max = cnt[i];
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
