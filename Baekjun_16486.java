import java.util.Scanner;

public class Baekjun_16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int r = sc.nextInt();
        double parameter = d1*2 + Math.PI*r*2;
        System.out.println(Math.round(parameter*1000000)/1000000.0);
    }
}
