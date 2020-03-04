import java.util.Scanner;

public class Baekjun_15921 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int num;
        for(int tc=0; tc<test_case; tc++)
            num = sc.nextInt();
        if(test_case == 0) System.out.println("divide by zero");
        else System.out.println("1.00");
    }
}
