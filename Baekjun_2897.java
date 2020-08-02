import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2897 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        char[][] park = new char[r][c];
        for(int i=0; i<r; i++){
            String line = br.readLine();
            for(int j=0; j<c; j++){
                park[i][j] = line.charAt(j);
            }
        }
        int[] cnt = new int[5];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i<r-1 && j<c-1){
                    int temp = 0;
                    if(park[i][j]=='#' || park[i+1][j]=='#' || park[i][j+1]=='#' || park[i+1][j+1]=='#') continue;
                    if(park[i][j] == 'X') temp++;
                    if(park[i+1][j] == 'X') temp++;
                    if(park[i][j+1] == 'X') temp++;
                    if(park[i+1][j+1] == 'X') temp++;
                    cnt[temp]++;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.println(cnt[i]);
        }
    }
}
