import java.util.Scanner;

public class Baekjun_14913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        if((k - a) % d != 0 || (k-a) / d < 0) System.out.println("X");
        else System.out.println((k - a) / d + 1);
    }
}
