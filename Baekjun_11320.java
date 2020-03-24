import java.util.Scanner;

public class Baekjun_11320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int l1 = sc.nextInt();
            int l2 = sc.nextInt();
            int temp = l1/l2;
            int result = (int)Math.pow(temp, 2);
            System.out.println(result);
        }
    }
}
