import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_15781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int helmat = sc.nextInt();
        int vest = sc.nextInt();
        int[] h_defense = new int[helmat];
        int[] v_defense = new int[vest];
        for(int i=0; i<helmat; i++) h_defense[i] = sc.nextInt();
        for(int i=0; i<vest; i++) v_defense[i] = sc.nextInt();
        Arrays.sort(h_defense);
        Arrays.sort(v_defense);
        System.out.println(h_defense[helmat-1] + v_defense[vest-1]);
    }
}
