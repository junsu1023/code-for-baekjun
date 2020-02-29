import java.util.Scanner;

public class Baekjun_17256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] c = new int[3];
        for(int i=0; i<3; i++) a[i] = sc.nextInt();
        for(int i=0; i<3; i++) c[i] = sc.nextInt();
        System.out.print(c[0]-a[2] + " " + c[1]/a[1] + " ");
        System.out.print(c[2]-a[0]);
    }
}
