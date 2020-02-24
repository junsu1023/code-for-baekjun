import java.util.Scanner;

public class Baekjun_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int num = sc.nextInt();
            int squared = sc.nextInt();
            int r = 1;
            for(int i=0; i<squared; i++) r = (r*num)%10;
            if(r==0) r = 10;
            System.out.println(r);
        }
    }
}
