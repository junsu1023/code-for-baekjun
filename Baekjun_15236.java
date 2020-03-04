import java.util.Scanner;

public class Baekjun_15236 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;
        for(int i=0; i<=num; i++)
            for(int j=i; j<=num; j++) ans = ans + i + j;
        System.out.println(ans);
    }
}
