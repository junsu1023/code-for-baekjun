import java.util.Scanner;

public class Baekjun_11131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int num = sc.nextInt();
            int sum = 0;
            for(int i=0; i<num; i++){
                int n = sc.nextInt();
                sum += n;
            }
            if(sum > 0) System.out.println("Right");
            else if(sum < 0) System.out.println("Left");
            else System.out.println("Equilibrium");
        }
    }
}
