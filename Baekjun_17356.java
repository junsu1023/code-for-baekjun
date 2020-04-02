import java.util.Scanner;

public class Baekjun_17356 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double m = (b-a)/400;
        double win = 1/(1+Math.pow(10, m));
        System.out.println(String.format("%.5f", win));
    }
}
