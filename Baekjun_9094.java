import java.util.Scanner;

public class Baekjun_9094 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cnt = 0;
            for(int a=1; a<n-1; ++a){
                for(int b=a+1; b<n; ++b){
                    if((a*a + b*b + m) % (a*b) == 0) cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
