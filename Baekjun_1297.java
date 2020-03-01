import java.util.Scanner;

public class Baekjun_1297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digonal = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();
        long squared_d = digonal*digonal;
        long squared_h = height*height;
        long squared_w = width*width;
        double ans = (double)squared_d / (double)(squared_w+squared_h);
        System.out.println((int)Math.sqrt(ans * squared_h) + " " + (int)Math.sqrt(ans * squared_w));
    }
}
