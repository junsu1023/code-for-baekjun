import java.util.Scanner;

public class Baekjun_10707 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int P = sc.nextInt();
        int pay_X = A * P;
        int pay_Y = P > C ? B + (P-C)*D : B;
        System.out.println(Math.min(pay_X, pay_Y));
    }
}
