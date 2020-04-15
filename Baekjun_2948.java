import java.util.Scanner;

public class Baekjun_2948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        String[] day = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int d = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(day[(month[m-1]+d-1)%7]);
    }
}
