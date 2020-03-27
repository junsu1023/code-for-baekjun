import java.util.Scanner;

public class Baekjun_13752 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i=0; i<test_case; i++){
            int n = sc.nextInt();
            for(int j=0; j<n; j++) System.out.print("=");
            System.out.println();
        }
    }
}
