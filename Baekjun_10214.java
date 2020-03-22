import java.util.Scanner;

public class Baekjun_10214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++) {
            int y_score = 0;
            int k_score = 0;
            for (int i = 0; i < 9; i++) {
                int y = sc.nextInt();
                int k = sc.nextInt();
                y_score += y;
                k_score += k;
            }
            if (y_score > k_score) System.out.println("Yonsei");
            else if (y_score < k_score) System.out.println("Korea");
            else System.out.println("Draw");
        }
    }
}
