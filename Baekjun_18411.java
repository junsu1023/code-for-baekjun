import java.util.Scanner;

public class Baekjun_18411 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        for(int i=0; i<3; i++) {
            n[i] = sc.nextInt();
        }
        int case1 = n[0] + n[1];
        int case2 = n[0] + n[2];
        int case3 = n[2] + n[1];
        int case4 = Math.max(case1, case2);
        System.out.println(Math.max(case3, case4));
    }
}
