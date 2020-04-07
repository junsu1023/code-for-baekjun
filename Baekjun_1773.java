import java.util.Scanner;

public class Baekjun_1773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int finish = sc.nextInt();
        int[] time = new int[finish+1];
        int[] cycle = new int[n];
        for(int i=0; i<n; i++) cycle[i] = sc.nextInt();
        long cnt = 0;
        for(int i=0; i<n; i++){
            int temp = cycle[i];
            for(int j=temp; j<=finish; j+=temp){
                time[j] = 1;
            }
        }
        for(int i=0; i<time.length; i++){
            if(time[i] == 1) cnt++;
        }
        System.out.println(cnt);
    }
}
