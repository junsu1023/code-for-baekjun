import java.util.Scanner;

public class Baekjun_10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int c_score = 100;
        int s_score = 100;
        for(int tc=0; tc<test_case; tc++){
            int chang = sc.nextInt();
            int sang = sc.nextInt();
            if(chang > sang) s_score-=chang;
            else if(chang < sang) c_score-=sang;
        }
        System.out.println(c_score + "\n" + s_score);
    }
}
