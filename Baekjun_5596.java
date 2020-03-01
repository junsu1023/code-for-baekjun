import java.util.Scanner;

public class Baekjun_5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] minguk = new int[4];
        int[] mansae = new int[4];
        int minguk_sum = 0;
        int mansae_sum = 0;
        for(int i=0; i<4; i++){
            minguk[i] = sc.nextInt();
            minguk_sum += minguk[i];
        }
        for(int i=0; i<4; i++){
            mansae[i] = sc.nextInt();
            mansae_sum += mansae[i];
        }
        System.out.println(Math.max(mansae_sum, minguk_sum));
    }
}
