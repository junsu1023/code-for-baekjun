import java.util.Scanner;

public class Baekjun_16917 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int first = Math.min(x, y);
        long ans = Math.min(a*(x-first)+b*(y-first), c*2*Math.max(x-first, y-first));
        if(a+b > c*2) ans += first*2*c;
        else ans += a*first + b*first;
        System.out.println(ans);
    }
}
