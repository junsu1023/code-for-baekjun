import java.util.Scanner;

public class Baekjun_2721 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int result = 0;
            for(int i=1; i<=n; ++i) result += ((i+1)*(i+2)/2) * i;
            System.out.println(result);
        }
    }
}
