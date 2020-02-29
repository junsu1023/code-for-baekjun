import java.util.Scanner;

public class Baekjun_2914 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int avg = sc.nextInt();
        int min = num * (avg-1) + 1;
        System.out.println(min);
    }
}
