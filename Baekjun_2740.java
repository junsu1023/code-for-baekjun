import java.util.Scanner;

public class Baekjun_2740 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        m = sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix2 = new int[m][k];
        for(int i=0; i<m; i++){
            for(int j=0; j<k; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] matrix3 = new int[n][k];
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                for(int a=0; a<m; a++){
                    matrix3[i][j] += (matrix1[i][a] * matrix2[a][j]);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<k; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
