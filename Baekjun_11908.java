import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_11908 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++) card[i] = sc.nextInt();
        Arrays.sort(card);
        int sum = 0;
        for(int i=0; i<card.length-1; i++) sum += card[i];
        System.out.println(sum);
    }
}
