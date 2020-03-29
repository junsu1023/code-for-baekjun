import java.util.Scanner;

public class Baekjun_14720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] milk = new int[test_case];
        for(int i=0; i<test_case; i++) milk[i] = sc.nextInt();
        int cnt = 0;
        int temp = 0;
        for(int i=0; i<test_case; i++){
            if(milk[i] == temp) {
                cnt++;
                temp++;
            }
            if(temp==3) temp = 0;
        }
        System.out.println(cnt);
    }
}
