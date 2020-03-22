import java.util.Scanner;

public class Baekjun_10409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            int running_time = sc.nextInt();
            sum += running_time;
            if(sum > time) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
