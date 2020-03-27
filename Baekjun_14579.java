import java.util.Scanner;

public class Baekjun_14579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int mul = 1;
        for(int i=1; i<a; ++i) sum += i;
        for(int i=a; i<=b; ++i){
            sum += i;
            mul *= sum%14579;
            mul %= 14579;
        }
        System.out.println(mul);
    }
}
