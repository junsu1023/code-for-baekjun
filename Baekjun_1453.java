import java.util.Scanner;

public class Baekjun_1453 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reject = 0;
        int[] seat = new int[101];
        for(int i=0; i<n; i++){
            int pick = sc.nextInt();
            if(seat[pick]==1) reject++;
            seat[pick]=1;
        }
        System.out.println(reject);
    }
}
