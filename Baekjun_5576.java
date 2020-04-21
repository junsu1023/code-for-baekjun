import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_5576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] w = new int[10];
        int[] k = new int[10];
        for(int i=0; i<10; i++) w[i] = sc.nextInt();
        for(int i=0; i<10; i++) k[i] = sc.nextInt();
        Arrays.sort(w);
        Arrays.sort(k);
        int w_score = w[7] + w[8] + w[9];
        int k_score = k[7] + k[8] + k[9];
        System.out.println(w_score + " " + k_score);
    }
}
