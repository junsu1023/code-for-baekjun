import java.util.Scanner;

public class Baekjun_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));
        int lcm = getLCM(num1, num2, gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static int getGCD(int a, int b){
        while(b>0){
            int tmp = a;
            a = b;
            b = tmp % a;
        }
        return a;
    }

    public static int getLCM(int a, int b, int gcd){
        return (a*b) / gcd;
    }
}
