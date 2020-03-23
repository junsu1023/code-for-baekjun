import java.util.Scanner;

public class Baekjun_10833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] share = new int[2];
        int rest = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++) share[j] = sc.nextInt();
            rest += share[1]%share[0];
        }
        System.out.println(rest);
    }
}
