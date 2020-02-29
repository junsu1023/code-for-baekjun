import java.util.Scanner;

public class Baekjun_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = new int[6];
        for(int i=0; i<6; i++) chess[i] = sc.nextInt();
        for(int i=0; i<2; i++) System.out.print(1-chess[i] + " ");
        for(int i=2; i<5; i++) System.out.print(2-chess[i] + " ");
        System.out.print(8-chess[5]);
    }
}
