import java.util.Scanner;

public class Baekjun_17177 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double x = Math.sqrt((a*a)-(b*b));
        double y = Math.sqrt((a*a)-(c*c));
        double d = ((x*y)-(b*c))/a;
        System.out.printf("%.0f", d<0 ? -1 : d);
    }
}
