import java.util.Scanner;

public class Baekjun_2506 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[num];
        int add = 1;
        int sum = 0;
        for(int i=0; i<num; i++) score[i] = sc.nextInt();
        if(score[0] == 1) sum += add;
        for(int i=1; i<num; i++){
            if(score[i] == 0) add = 1;
            if(score[i] == 1 && score[i] == score[i-1]) {
                add++;
                sum += add;
            }
            else if(score[i] == 1 && score[i] != score[i-1]) sum += 1;
        }
        System.out.println(sum);
    }
}
