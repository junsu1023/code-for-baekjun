import java.util.Scanner;

public class Baekjun_5063 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            if(r+c < e) System.out.println("advertise");
            else if(r+c > e) System.out.println("do not advertise");
            else System.out.println("does not matter");
        }
    }
}
