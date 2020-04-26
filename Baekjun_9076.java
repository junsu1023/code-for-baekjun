import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_9076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] score = new int[5];
        for(int tc=0; tc<test_case; tc++){
            for(int i=0; i<5; i++) score[i] = sc.nextInt();
            Arrays.sort(score);
            if(score[3] - score[1] >= 4){
                System.out.println("KIN");
            }
            else {
                System.out.println(score[1] + score[2] + score[3]);
            }
        }
    }
}
