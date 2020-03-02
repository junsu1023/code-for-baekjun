import java.util.Scanner;

public class Baekjun_13136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        int n = sc.nextInt();
        long need = (long) (col/n + (col%n > 0 ? 1 : 0)) * (row/n + (row%n > 0 ? 1 : 0));
        System.out.println(need);
    }
}
