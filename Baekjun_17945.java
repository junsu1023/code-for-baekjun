import java.util.Scanner;

public class Baekjun_17945 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        int plus = (int)(-a + Math.sqrt(a*a - b));
        int minus = (int)(-a - Math.sqrt(a*a - b));
        if(plus==minus) System.out.println(plus);
        else System.out.println(minus + " " + plus);
    }
}
