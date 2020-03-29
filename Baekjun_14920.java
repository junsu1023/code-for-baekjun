import java.util.Scanner;

public class Baekjun_14920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        while(n != 1){
            if(n%2==0) n/=2;
            else n = 3*n+1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
