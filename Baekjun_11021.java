import java.util.Scanner;

public class Baekjun_11021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for(int i=1; i<=T; i++){
            int A = input.nextInt();
            int B = input.nextInt();
            int result = A+B;
            System.out.println("Case #" + i + ": " + result);
        }
    }
}
