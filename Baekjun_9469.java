import java.util.Scanner;

public class Baekjun_9469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            double d = sc.nextDouble();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double f = sc.nextDouble();
            double result = (double)d/(a+b)*f;
            System.out.println(n + " " + Math.round(result*1000000)/1000000.0);
        }
    }
}
