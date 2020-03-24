import java.util.Scanner;

public class Baekjun_11134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int cookie = sc.nextInt();
            int eat = sc.nextInt();
            int day = 0;
            if(cookie%eat==0) day = cookie/eat;
            else day = cookie/eat + 1;
            System.out.println(day);
        }
    }
}
