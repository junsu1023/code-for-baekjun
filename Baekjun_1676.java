import java.util.Scanner;

public class Baekjun_1676 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i=5; i<=num; i*=5) count += num/i;
        System.out.println(count);
    }
}
