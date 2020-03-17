import java.util.Scanner;

public class Baekjun_5751 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int game = sc.nextInt();
            if(game == 0) break;
            int[] score = new int[game];
            int mwin = 0;
            int jwin = 0;
            for(int i=0; i<game; i++){
                score[i] = sc.nextInt();
                if(score[i] == 0) mwin++;
                else jwin++;
            }
            System.out.println("Mary won " + mwin + " times and John won " + jwin + " times");
        }
    }
}
