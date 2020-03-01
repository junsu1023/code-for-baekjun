import java.util.Scanner;

public class Baekjun_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int running = sc.nextInt();
        hour += running/60;
        minute += running%60;
        if(minute>=60){
            hour++;
            minute%=60;
        }
        if(hour>=24){
            hour%=24;
        }
        System.out.println(hour + " " + minute);
    }
}
