import java.util.Scanner;

public class Baekjun_5176 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int p = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            int[] cnt = new int[501];
            for(int i=0; i<p; i++){
                int w = sc.nextInt();
                if(cnt[w]==0){
                    count++;
                    cnt[w]++;
                }
                else cnt[w] = 1;
            }
            int result = p - count;
            System.out.println(result);
        }
    }
}
