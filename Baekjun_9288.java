import java.util.Scanner;

public class Baekjun_9288 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            System.out.println("Case " + (tc+1) + ":");
            for(int i=1; i<=6; i++){
                for(int j=i; j<=6; j++){
                    if(i+j==n){
                        System.out.println("(" + i + "," + j + ")");
                    }
                }
            }
        }
    }
}
