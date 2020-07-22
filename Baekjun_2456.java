import java.util.Scanner;

public class Baekjun_2456 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cnt = new int[4][4];
        for(int i=0; i<n; i++){
            cnt[1][sc.nextInt()]++;
            cnt[2][sc.nextInt()]++;
            cnt[3][sc.nextInt()]++;
        }
        int max = -1;
        int check = 0;
        int winner = -1;
        for(int i=1; i<4; i++){
            int sum = cnt[i][1] + 2*cnt[i][2] + 3*cnt[i][3];
            if(max < sum){
                max = sum;
                winner = i;
            }
            else if(sum == max){
                if(cnt[winner][3] < cnt[i][3]){
                    winner = i;
                    check = 0;
                }
                else if(cnt[winner][3] == cnt[i][3] && cnt[winner][2] < cnt[i][2]){
                    winner = i;
                    check = 0;
                }
                else if(cnt[winner][3] == cnt[i][3] && cnt[winner][2] == cnt[i][2]) check = 1;
            }
        }
        if(check == 0) System.out.println(winner + " " + max);
        else {
            winner = 0;
            System.out.println(winner + " " + max);
        }
    }
}
