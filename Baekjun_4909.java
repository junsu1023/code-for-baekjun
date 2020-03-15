import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baekjun_4909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            List<Integer> list = new LinkedList<>();
            DecimalFormat df = new DecimalFormat("#.##");
            int[] score = new int[6];
            double sum = 0;
            for(int i=0; i<6; i++){
                score[i] = sc.nextInt();
                list.add(score[i]);
            }
            if(score[0] == 0 && score[1] == 0 && score[2] == 0 && score[3] == 0 && score[4] == 0 && score[5] == 0) break;
            Collections.sort(list);
            for(int i=1; i<5; i++) sum += list.get(i);
            double avg = sum/4;
            System.out.println(df.format(avg));
        }
    }
}
