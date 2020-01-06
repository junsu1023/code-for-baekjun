import java.util.Scanner;

public class Baekjun_10872 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    public static int factorial(int num) {
        int a = 1;
        if(num==1) return 1;
        else if (num > 1) {
            for (int i=1; i<=num; i++) {
                a = a * i;
            }
        }
        return a;
    }
}
