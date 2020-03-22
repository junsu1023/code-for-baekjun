import java.util.Scanner;

public class Baekjun_9713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int sum = 0;
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
                if(i%2==1) sum += i;
            }
            System.out.println(sum);
        }
    }
}
