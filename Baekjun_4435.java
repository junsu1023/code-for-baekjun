import java.util.Scanner;

public class Baekjun_4435 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int[] g_team = new int[6];
            int[] s_team = new int[7];
            int[] g_ability = {1, 2, 3, 3, 4, 10};
            int[] s_ability = {1, 2, 2, 2, 3, 5, 10};
            int g_sum = 0;
            int s_sum = 0;
            for(int i=0; i<6; i++){
                g_team[i] = sc.nextInt();
                g_sum += g_ability[i] * g_team[i];
            }
            for(int i=0; i<7; i++){
                s_team[i] = sc.nextInt();
                s_sum += s_ability[i] * s_team[i];
            }
            if(g_sum > s_sum) System.out.println("Battle " + (tc+1) + ": " + "Good triumphs over Evil");
            else if(g_sum < s_sum) System.out.println("Battle " + (tc+1) + ": " + "Evil eradicates all trace of Good");
            else System.out.println("Battle " + (tc+1) + ": " + "No victor on this battle field");
        }
    }
}
