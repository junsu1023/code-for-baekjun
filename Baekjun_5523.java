import java.util.Scanner;

public class Baekjun_5523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[][] score = new int[test_case][2];
        int cnt1 = 0;
        int cnt2 = 0;
        for(int tc=0; tc<test_case; tc++){
            for(int i=0; i<2; i++) score[tc][i] = sc.nextInt();
            if(score[tc][0] > score[tc][1]) cnt1++;
            else if(score[tc][0] < score[tc][1]) cnt2++;
        }
        System.out.println(cnt1 + " " + cnt2);
    }
}
