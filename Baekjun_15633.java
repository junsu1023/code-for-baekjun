import java.util.Scanner;

public class Baekjun_15633 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0) sum += i;
        }
        sum = sum*5-24;
        System.out.println(sum);
    }
}
