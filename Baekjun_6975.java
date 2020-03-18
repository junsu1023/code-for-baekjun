import java.util.Scanner;

public class Baekjun_6975 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int sum = 0;
            for(int i=1; i<=n/2; i++){
                if(n%i==0) {
                    sum += i;
                }
            }
            if(sum < n) System.out.println(n + " is a deficient number." + "\n");
            else if(sum > n) System.out.println(n + " is an abundant number." + "\n");
            else System.out.println(n + " is a perfect number." + "\n");
        }
    }
}
