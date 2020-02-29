import java.util.Scanner;

public class Baekjun_17496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int growth = sc.nextInt();
        int area = sc.nextInt();
        int price = sc.nextInt();
        System.out.println((day-1)/growth*area*price);
    }
}
