import java.util.Scanner;

public class Baekjun_2869 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextInt();
        double B = input.nextInt();
        double V = input.nextInt();

        if(V == A) System.out.println(1);
        else System.out.println((long)Math.ceil((V-A)/(A-B))+1);
    }
}