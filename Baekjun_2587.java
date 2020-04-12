import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] n = new int[5];
        for(int i=0; i<5; i++){
            n[i] = sc.nextInt();
            sum += n[i];
        }
        int avg = sum/5;
        Arrays.sort(n);
        System.out.println(avg + "\n" + n[2]);
    }
}
