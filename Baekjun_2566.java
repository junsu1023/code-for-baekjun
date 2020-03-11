import java.util.Scanner;

public class Baekjun_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[10][10];
        int i_pos = 0;
        int j_pos = 0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                num[i][j] = sc.nextInt();
                if(num[i_pos][j_pos] < num[i][j]){
                    i_pos = i;
                    j_pos = j;
                }
            }
        }
        System.out.println(num[i_pos][j_pos]);
        System.out.println(i_pos+1 + " " + (j_pos+1));
    }
}
