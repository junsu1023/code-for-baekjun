import java.util.Scanner;

public class Baekjun_13225 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            int n = sc.nextInt();
            int cnt = 0;
            for(int j=1; j<=n; j++){
                if(n%j==0) cnt++;
            }
            System.out.println(n + " " + cnt);
        }
    }
}
