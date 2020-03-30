import java.util.Scanner;

public class Baekjun_16479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double temp = Math.pow((d1-d2)/2.0, 2);
        double height = Math.pow(k, 2) - temp;
        System.out.println(height);
    }
}
