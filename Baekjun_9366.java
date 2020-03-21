import java.util.Arrays;
import java.util.Scanner;

public class Baekjun_9366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] n = new int[3];
        for(int tc=0; tc<test_case; tc++){
            String kind = "";
            for(int i=0; i<3; i++) n[i] = sc.nextInt();
            Arrays.sort(n);
            if(n[0] + n[1] <= n[2]) {
                kind = "invalid!";
            }
            else {
                if (n[0] == n[1] && n[1] == n[2]) kind = "equilateral";
                else if (n[0] == n[1] || n[1] == n[2] || n[0] == n[2]) kind = "isosceles";
                else if (n[0] != n[1] && n[0] != n[2] && n[1] != n[2]) kind = "scalene";
            }
            System.out.println("Case #" + (tc+1) + ": " + kind);
        }
    }
}
