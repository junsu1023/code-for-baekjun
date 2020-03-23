import java.util.Scanner;

public class Baekjun_10480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            if(n%2==0) System.out.println(n + " is even");
            else System.out.println(n + " is odd");
        }
    }
}
