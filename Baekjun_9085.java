import java.util.Scanner;

public class Baekjun_9085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int sum = 0;
            for(int i=0; i<n; i++){
                int input = sc.nextInt();
                sum += input;
            }
            System.out.println(sum);
        }
    }
}
