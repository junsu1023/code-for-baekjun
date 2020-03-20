import java.util.Scanner;

public class Baekjun_9295 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        int[] num = new int[2];
        for(int tc=0; tc<test_case; tc++){
            for(int i=0; i<2; i++) num[i] = sc.nextInt();
            System.out.print("Case " + (tc+1) + ": ");
            System.out.println(num[0]+num[1]);
        }
    }
}
