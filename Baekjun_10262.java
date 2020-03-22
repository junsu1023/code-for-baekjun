import java.util.Scanner;

public class Baekjun_10262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ggoong = new int[4];
        int[] seok = new int[4];
        int g_win = 0;
        int s_win = 0;
        for(int i=0; i<4; i++){
            ggoong[i] = sc.nextInt();
            g_win += ggoong[i];
        }
        for(int i=0; i<4; i++){
            seok[i] = sc.nextInt();
            s_win += seok[i];
        }
        if(g_win > s_win) System.out.println("Gunnar");
        else if(g_win < s_win) System.out.println("Emma");
        else System.out.println("Tie");
    }
}
