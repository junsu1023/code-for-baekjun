import java.util.Scanner;

public class Baekjun_15885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        int result = (int)(Math.abs(a/b-1)*2);
        System.out.println(result);
    }
}
