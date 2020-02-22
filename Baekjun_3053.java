import java.util.Scanner;

public class Baekjun_3053 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int R = input.nextInt();

        String res1 = String.format("%.6f", Math.PI * R * R) ;
        String res2 = String.format("%.6f", (double)2 * R * R) ;

        System.out.println(res1);
        System.out.println(res2);
    }
}
