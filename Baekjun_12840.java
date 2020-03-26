import java.util.Scanner;

public class Baekjun_12840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nh = sc.nextInt();
        int nm = sc.nextInt();
        int ns = sc.nextInt();
        int total = nh * 3600 + nm * 60 + ns;
        int test_case = sc.nextInt();
        for (int tc = 0; tc < test_case; tc++) {
            int comment = sc.nextInt();
            if (comment == 1) {
                int increase = sc.nextInt();
                total = (total + increase) % 86400;
            } else if (comment == 2) {
                int decrease = sc.nextInt();
                total = (total - decrease) % 86400;
                while (total < 0) total += 86400;
            } else if (comment == 3) {
                int lh = total / 3600;
                int lm = total % 3600 / 60;
                int ls = total % 3600 % 60;
                System.out.println(lh + " " + lm + " " + ls);
            }
        }
    }
}
