import java.util.Scanner;

public class Baekjun_16462 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            String score = sc.next();
            if(!score.equals("100")){
                score = score.replace("0", "9");
                score = score.replace("6", "9");
                total += Integer.parseInt(score);
            }
            else total += Integer.parseInt(score);
        }
        double avg = (double)total / n;
        System.out.println(Math.round(avg));
    }
}
