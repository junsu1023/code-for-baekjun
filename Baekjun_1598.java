import java.util.Scanner;

public class Baekjun_1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int row = Math.abs((n1-1)%4-(n2-1)%4);
        int col = Math.abs((n1-1)/4-(n2-1)/4);
        System.out.println(row + col);
    }
}
