import java.util.Scanner;

public class Baekjun_2669 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] pos = new int[101][101];
        for(int i=0; i<4; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    pos[j][k] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i<101; i++){
            for(int j=0; j<101; j++){
                if(pos[i][j]==1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
