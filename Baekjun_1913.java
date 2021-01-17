import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int save_size = size;
        int max = size * size;
        int[][] snale = new int[size][size];
        int row = -1;
        int col = 0;
        int count = 1;
        while(true){
            for(int i=1; i<=save_size; i++){
                row += count;
                snale[row][col] = max;
                max--;
            }
            save_size--;
            if(save_size == 0) break;
            for(int i=1; i<=save_size; i++){
                col += count;
                snale[row][col] = max;
                max--;
            }
            count *= -1;
        }
        int[] pos = new int[2];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(snale[i][j] == n){
                    pos[0] = i+1;
                    pos[1] = j+1;
                }
                sb.append(snale[i][j] + " ");
            }
            if(i != size-1) sb.append("\n");
        }
        System.out.println(sb.toString());
        System.out.println(pos[0] + " " + pos[1]);
        br.close();
    }
}
