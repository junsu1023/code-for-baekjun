import java.util.Scanner;

public class Baekjun_18414 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        for(int i=0; i<3; i++) n[i] = sc.nextInt();
        if(n[0] >= n[2]) System.out.println(n[2]);
        else if(n[0] <= n[1]) System.out.println(n[1]);
        else if(n[0] > n[1] && n[0] < n[2]) System.out.println(n[0]);
    }
}
