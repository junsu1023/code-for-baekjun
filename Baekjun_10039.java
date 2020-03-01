import java.util.Scanner;

public class Baekjun_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            score[i] = sc.nextInt();
            if(score[i] < 40) sum += 40;
            else sum += score[i];
        }
        int avg = sum/5;
        System.out.println(avg);
    }
}
