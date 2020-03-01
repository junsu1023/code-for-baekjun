import java.util.Scanner;

public class Baekjun_10179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            double price = sc.nextDouble();
            double sale = price*0.8;
            System.out.println(String.format("$%.2f", sale));
        }
    }
}
