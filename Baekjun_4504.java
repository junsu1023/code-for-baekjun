import java.util.Scanner;

public class Baekjun_4504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        while(true){
            int num = sc.nextInt();
            if(num==0) break;
            if(num%divisor==0) System.out.println(num + " is a multiple of " + divisor + ".");
            else System.out.println(num + " is NOT a multiple of " + divisor + ".");
        }
    }
}
