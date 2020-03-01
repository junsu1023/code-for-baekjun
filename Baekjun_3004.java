import java.util.Scanner;

public class Baekjun_3004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int row = num/2;
        int col = num-row;
        int result = (row+1) * (col+1);
        System.out.println(result);
    }
}
