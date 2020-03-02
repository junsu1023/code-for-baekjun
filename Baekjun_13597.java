import java.util.Scanner;

public class Baekjun_13597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] card = new int[2];
        for(int i=0; i<2; i++) card[i] = sc.nextInt();
        int max = 0;
        for(int i=0; i<2; i++){
            if(card[i] > max) max = card[i];
        }
        System.out.println(max);
    }
}
