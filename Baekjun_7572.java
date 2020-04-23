import java.util.Scanner;

public class Baekjun_7572 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n += 2400-2013;
        int a = (n + 5) % 12;
        int b = (n + 9) % 10;
        System.out.printf("%c%c", a+'A', b+'0');
    }
}
