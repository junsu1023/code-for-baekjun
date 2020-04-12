import java.util.Scanner;

public class Baekjun_2592 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] cnt = new int[1001];
        for(int i=0; i<10; i++){
            int n = sc.nextInt();
            cnt[n]++;
            sum += n;
        }
        int avg = sum/10;
        int temp = 0;
        int max = 0;
        for(int i=10; i<1001; i+=10){
            if(cnt[i] > temp){
                temp = cnt[i];
                max = i;
            }
        }
        System.out.println(avg + "\n" + max);
    }
}
