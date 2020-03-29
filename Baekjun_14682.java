import java.util.Scanner;

public class Baekjun_14682 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int sum = num;
        for(int i=0; i<n; i++){
            num *= 10;
            sum += num;
        }
        System.out.println(sum);
    }
}
