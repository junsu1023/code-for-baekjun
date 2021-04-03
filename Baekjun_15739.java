import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_15739 {
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if(sumCheck(matrix) && overlapCheck(matrix)) System.out.println("TRUE");
        else System.out.println("FALSE");
        br.close();
    }
    public static boolean sumCheck(int[][] matrix){
        int standard = (int) (n * (Math.pow(n, 2) + 1) / 2);
        boolean check = true;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += matrix[i][j];
            }
            if(sum != standard){
                check = false;
                break;
            }
        }
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += matrix[j][i];
            }
            if(sum != standard){
                check = false;
                break;
            }
        }
        int sum1 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j) sum1 += matrix[i][j];
            }
        }
        if(sum1 != standard) check = false;
        int sum2 = 0;
        int xpos = n-1;
        int ypos = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == ypos && j == xpos){
                    sum2 += matrix[i][j];
                    xpos--;
                    ypos++;
                }
            }
        }
        if(sum2 != standard) check = false;
        return check;
    }
    public static boolean overlapCheck(int[][] matrix){
        boolean check = true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(matrix[i][j] == matrix[i][k] && j!=k){
                        check = false;
                        break;
                    }
                }
                if(!check) break;
            }
            if(!check) break;
        }
        return check;
    }
}