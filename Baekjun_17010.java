import java.util.Scanner;

public class Baekjun_17010 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            char op = sc.next().charAt(0);
            for(int i=0; i<n; i++){
                System.out.print(op);
            }
            System.out.println();
        }
    }
}
