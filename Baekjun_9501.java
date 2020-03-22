import java.util.Scanner;

public class Baekjun_9501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int rocket = sc.nextInt();
            int distance = sc.nextInt();
            int cnt = 0;
            for(int i=0; i<rocket; i++){
                int max_speed = sc.nextInt();
                int fuel = sc.nextInt();
                int comsumption = sc.nextInt();
                if(max_speed*fuel/comsumption>=distance) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
