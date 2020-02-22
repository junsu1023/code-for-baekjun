import java.util.Scanner;

public class Baekjun_1546 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double[] score = new double[num];
        double[] save_score = new double[num];
        double sum = 0;
        double avg = 0;

        double max = -100;
        for(int i=0; i<num; i++){
            score[i] = input.nextInt();
            if(score[i]>max)
                max = score[i];
        }
        for(int i=0; i<num; i++) {
            save_score[i] = score[i]/max*100;
            sum += save_score[i];
        }
        avg = sum / num;
        System.out.println(avg);
    }
}
