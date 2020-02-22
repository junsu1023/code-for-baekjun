import java.util.Scanner;

public class Baekjun_4153 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a == 0 && b == 0 && c == 0)
                break;
            if (c*c == a*a + b*b || b*b == a*a + c*c || a*a == c*c + b*b)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
