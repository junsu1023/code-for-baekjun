import java.util.Scanner;

public class Baekjun_5361 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            double A = sc.nextInt();
            double B = sc.nextInt();
            double C = sc.nextInt();
            double D = sc.nextInt();
            double E = sc.nextInt();
            double price = 350.34*A + 230.90*B + 190.55*C + 125.30*D + 180.90*E;
            System.out.println(String.format("$%.2f", price));
        }
    }
}
