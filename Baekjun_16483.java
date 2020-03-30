import java.util.Scanner;

public class Baekjun_16483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        t/=2.0;
        int result = (int)(t*t + 0.5);
        System.out.println(result);
    }
}
