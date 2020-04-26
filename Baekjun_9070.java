import java.util.Scanner;

public class Baekjun_9070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int[] weight = new int[n];
            int[] cost = new int[n];
            double[] cost_ratio = new double[n];
            for(int i=0; i<n; i++){
                weight[i] = sc.nextInt();
                cost[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++) cost_ratio[i] = (double)weight[i] / (double)cost[i];
            double max = 0;
            int total = 0;
            for(int i=0; i<n; i++){
                if(cost_ratio[i] > max){
                    max = cost_ratio[i];
                    total = cost[i];
                }
                else if(cost_ratio[i] == max){
                    if(cost[i] < total) total = cost[i];
                }
            }
            System.out.println(total);
        }
    }
}
