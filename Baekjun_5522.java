import java.util.Scanner;

public class Baekjun_5522 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }
        System.out.println(sum);
    }
}
