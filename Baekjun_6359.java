import java.util.Scanner;

public class Baekjun_6359 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int tc=0; tc<test_case; tc++){
            int n = sc.nextInt();
            int[] door = new int[n+1];
            for(int i=1; i<=n; i++){
                for(int j=1; j*i<=n; j++){
                    if(door[i*j]==0) door[i*j] = 1;
                    else door[i*j] = 0;
                }
            }
            int total = 0;
            for(int i=1; i<=n; i++) total += door[i];
            System.out.println(total);
        }
    }
}
