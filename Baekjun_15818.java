import java.util.Scanner;

public class Baekjun_15818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long result = 1;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            result *= a%m;
            result %= m;
        }
        System.out.println(result);
    }
}
