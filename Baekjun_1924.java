import java.util.Scanner;

public class Baekjun_1924 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] month = {0,31,59,90,120,151,181,212,243,273,304,334};
        String[] days= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        y += month[x-1];
        System.out.println(days[y%7]);
    }
}
