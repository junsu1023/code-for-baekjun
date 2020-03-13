import java.util.Scanner;

public class Baekjun_2953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[5][4];
        int i=0, j=0;
        int sum = 0;
        int max = 0;
        int index = 0;
        for(i=0; i<5; i++){
            for(j=0; j<4; j++){
                score[i][j] = sc.nextInt();
                sum += score[i][j];
            }
            if(sum >= max) {
                max = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println((index+1) + " " + max);
    }

}
