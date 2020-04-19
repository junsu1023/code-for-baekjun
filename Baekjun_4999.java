import java.util.Scanner;

public class Baekjun_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String can = sc.nextLine();
        String want = sc.nextLine();
        if(can.length() >= want.length()) System.out.println("go");
        else System.out.println("no");
    }
}
