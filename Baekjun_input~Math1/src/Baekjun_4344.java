import java.util.Scanner;

public class Baekjun_4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cntRow = sc.nextInt(); // 시험 수
        int cnt, sum, over;
        double result, per;

        for (int i=0; i<cntRow; i++) {
            cnt = sc.nextInt();
            sum = 0;
            over = 0;
            result = 0.0;
            int score[] = new int[cnt];

            for (int j=0; j<cnt; j++) {
                score[j] = sc.nextInt();
                sum += score[j];
            }

            for (int j=0; j<cnt; j++) {
                if (score[j] > (double)sum/cnt) {
                    over++;
                }
            }

            result = (double)over/cnt*100;

            per = Math.round(result*1000)/1000.0;

            System.out.printf("%.3f", per);
            System.out.println("%");
        }
    }
}