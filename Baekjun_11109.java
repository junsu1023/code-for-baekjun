import java.util.Scanner;

public class Baekjun_11109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int d = sc.nextInt();
            int n = sc.nextInt();
            int s = sc.nextInt();
            int p = sc.nextInt();
            int serial = n*s;
            int parallel = d+n*p;
            if(serial > parallel) System.out.println("parallelize");
            else if(serial < parallel) System.out.println("do not parallelize");
            else System.out.println("does not matter");
        }
    }
}
