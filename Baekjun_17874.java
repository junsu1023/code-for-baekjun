import java.util.Scanner;

public class Baekjun_17874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int col = sc.nextInt();
        int row = sc.nextInt();
        int c = Math.max(col, length-col);
        int r = Math.max(row, length-row);
        int result = c*r*4;
        System.out.println(result);
    }
}
