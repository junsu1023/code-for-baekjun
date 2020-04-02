import java.util.Scanner;

public class Baekjun_18247 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = 0;
            if(n<12 || m<4) System.out.println(-1);
            else{
                l = 11 * m + 4;
                System.out.println(l);
            }
        }
    }
}
