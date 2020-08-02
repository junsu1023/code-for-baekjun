import java.text.DecimalFormat;
import java.util.Scanner;

public class Baekjun_2896 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.######");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double l = sc.nextInt();
        double j = sc.nextInt();
        double k = sc.nextInt();
        double t1 = a/l;
        double t2 = b/j;
        double t3 = c/k;
        double min = Math.min(t1, t2);
        min = Math.min(min, t3);
        System.out.println(df.format(point(a-min*l)) + " " + df.format(point(b-min*j)) + " " + df.format(point(c-min*k)));
    }
    public static double point(double a){
        return Math.round(a*1000000)/1000000.0;
    }
}
