import java.util.Scanner;

public class Baekjun_1268 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] student = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                student[i][j] = sc.nextInt();
            }
        }
        int[][] cnt = new int[1000][1000];
        for(int i=0; i<5; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    if(student[j][i]==student[k][i] && j!=k) cnt[j][k] = 1;
                }
            }
        }
        int max = -1;
        int index = 0;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<n; j++){
                temp += cnt[i][j];
            }
            if(temp > max)
            {
                max = temp;
                index = i+1;
            }
        }
        System.out.println(index);
    }
}
