import java.util.Scanner;

public class Baekjun_7489 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int fac = 1;
            for(int i=2; i<=n; i++){
                fac *= i;
                while(fac % 10 == 0){
                    fac /= 10;
                }
            }
            System.out.println(fac%10);
        }
    }
}
