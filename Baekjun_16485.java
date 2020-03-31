import java.util.Scanner;

public class Baekjun_16485 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double b = sc.nextDouble();
        double result = c/b;
        System.out.println(String.format("%.6f", result));
    }
}
