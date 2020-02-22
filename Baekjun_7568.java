import java.util.Scanner;

public class Baekjun_7568 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] body = new int[num][2];
        int[] rank = new int[num];

        for(int i=0; i<num; i++){
            rank[i] = 1;
            body[i][0] = input.nextInt();
            body[i][1] = input.nextInt();
        }
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(body[i][0] > body[j][0] && body[i][1] > body[j][1])
                    rank[j]++;
            }
        }
        for(int i=0; i<num; i++)
            System.out.print(rank[i] + " ");
    }
}
