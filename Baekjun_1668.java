import java.util.Scanner;

public class Baekjun_1668 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] trophy = new int[n];
        for(int i=0; i<n; i++)  trophy[i] = sc.nextInt();
        int cnt1 = 1;
        int cnt2 = 1;
        int first = trophy[0];
        for(int i=0; i<n; i++){
            if(trophy[i] > first){
                cnt1++;
                first = trophy[i];
            }
        }
        first = trophy[n-1];
        for(int i=n-1; i>=0; i--){
            if(trophy[i] > first){
                cnt2++;
                first = trophy[i];
            }
        }
        System.out.println(cnt1 + "\n" + cnt2);
    }
}
