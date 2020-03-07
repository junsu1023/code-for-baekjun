import java.util.Scanner;

public class Baekjun_1964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long result = 0;
        result = 1 + 4*num + 3*num*(num-1)/2;
        result %= 45678;
        System.out.println(result);
    }
}
