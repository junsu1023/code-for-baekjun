import java.util.Scanner;

public class Baekjun_1085 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int w = input.nextInt();
        int h = input.nextInt();

        int dx = -1;
        int dy = -1;

        if(x > w/2) dy = Math.abs(w-x);
        else dy = x;

        if(y > h/2) dx = Math.abs(h-y);
        else dx = y;

        System.out.println(Math.min(dy, dx));
    }
}