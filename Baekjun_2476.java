import java.util.Scanner;

public class Baekjun_2476 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dice = new int[3];
        int[] sum = new int[n];
        int max_sum = 0;
        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<3; j++) {
                dice[j] = sc.nextInt();
                if(dice[j] > max) max = dice[j];
            }
            if(dice[0]==dice[1] && dice[1]==dice[2]) sum[i] += 10000+dice[0]*1000;
            else if(dice[0]==dice[1] || dice[0]==dice[2]) sum[i] += 1000+dice[0]*100;
            else if(dice[1]==dice[2]) sum[i] += 1000+dice[1]*100;
            else sum[i] += max*100;
            for(int j=0; j<sum.length; j++){
                if(sum[j] > max_sum) max_sum = sum[j];
            }
        }
        System.out.println(max_sum);
    }

}
