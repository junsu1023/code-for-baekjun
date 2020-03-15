import java.util.Scanner;

public class Baekjun_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long n1 = sc.nextInt();
            long n2 = sc.nextInt();
            if(n1==0 && n2==0) break;
            if(n1 <= n2) System.out.println("No");
            else if(n1 > n2) System.out.println("Yes");
        }
    }
}
