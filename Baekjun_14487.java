import java.util.Scanner;

public class Baekjun_14487 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dis = new int[n];
        int total = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            dis[i] = sc.nextInt();
            total += dis[i];
            if(max < dis[i]) max = dis[i];
        }
        int result = total - max;
        System.out.println(result);
    }
}
