import java.util.Scanner;

public class Baekjun_9550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int cnt = 0;
            for(int i=0; i<n; i++){
                int candy_num = sc.nextInt();
                cnt += candy_num/k;
            }
            System.out.println(cnt);
        }
    }
}
