import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_5054 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int[] shop = new int[n];
            for(int i=0; i<n; i++) shop[i] = sc.nextInt();
            Arrays.sort(shop);
            int result = (shop[n-1] - shop[0]) * 2;
            System.out.println(result);
        }
    }
}
