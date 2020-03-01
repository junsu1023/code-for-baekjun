import java.util.Scanner;

public class Baekjun_2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
        int running = sc.nextInt();
        second += running;
        minute += second/60;
        second%=60;
        hour += minute/60;
        minute%=60;
        hour%=24;
        System.out.println(hour + " " + minute + " " + second);
    }
}
