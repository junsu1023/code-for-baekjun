import java.util.Scanner;

public class Baekjun_11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] paskal = new int[1001][1001];
        paskal[0][0] = paskal[1][0] = paskal[1][1] = 1;
        for(int i=2; i<=N; i++){
            for(int j=0; j<=i; j++){
                if(i==j || j==0) paskal[i][j] = 1;
                else paskal[i][j] = paskal[i-1][j-1] + paskal[i-1][j];
                paskal[i][j] %= 10007;
            }
        }
        System.out.println(paskal[N][K]);
    }
}

