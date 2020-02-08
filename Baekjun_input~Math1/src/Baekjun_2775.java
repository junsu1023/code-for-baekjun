import java.util.Scanner;

public class Baekjun_2775 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=0; i<num; i++){
            int k = input.nextInt();
            int n = input.nextInt();
            System.out.println(el(k, n));
        }
    }

    private static int el(int k, int n) {
        if (n == 0)
            return 0;
        else if (k == 0)
            return n;
        else {
            return el(k, n - 1) + el(k - 1, n);
        }
    }
}
