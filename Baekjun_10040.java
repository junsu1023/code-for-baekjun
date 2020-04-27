import java.util.Scanner;

public class Baekjun_10040 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] contest = new int[n];
        int[] cost = new int[m];
        int[] score = new int[n];
        for(int i=0; i<n; i++) contest[i] = sc.nextInt();
        for(int i=0; i<m; i++) cost[i] = sc.nextInt();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(cost[i] >= contest[j]){
                    score[j]++;
                    break;
                }
            }
        }
        int max = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(max < score[i]){
                max = score[i];
                index = i+1;
            }
        }
        System.out.println(index);
    }
}
