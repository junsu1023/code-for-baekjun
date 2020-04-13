import java.util.Scanner;

public class Baekjun_2774 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        sc.nextLine();
        for(int tc=0; tc<test_case; tc++){
            String[] n = sc.nextLine().split("");
            int[] cnt = new int[10];
            for(int i=0; i<n.length; i++){
                cnt[Integer.parseInt(n[i])] = 1;
            }
            int count = 0;
            for(int i=0; i<10; i++){
                if(cnt[i] == 1) count++;
            }
            System.out.println(count);
        }
    }
}
