import java.util.Scanner;

public class Baekjun_9546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int total = (int)(Math.pow(2, n) - 1);
            System.out.println(total);
        }
    }
}
