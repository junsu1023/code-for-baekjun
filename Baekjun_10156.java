import java.util.Scanner;

public class Baekjun_10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int num = sc.nextInt();
        int have_money = sc.nextInt();
        int need_money = price * num;
        int distingush = have_money - need_money;
        if(distingush >= 0) System.out.println(0);
        else System.out.println(Math.abs(distingush));
    }
}
