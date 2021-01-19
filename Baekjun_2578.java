import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_2578 {
    public static int[][] bingo = new int[5][5];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                bingo[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                if(check(Integer.parseInt(st.nextToken())) >= 3){
                    System.out.println(5 * i + j + 1);
                    return;
                }
            }
        }
        br.close();
    }
    public static int check(int n){
        int line = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(bingo[i][j] == n) bingo[i][j] = 0;
            }
        }
        for(int i=0; i<5; i++){
            boolean lineCheck = true;
            for(int j=0; j<5; j++){
                if(bingo[i][j] > 0) lineCheck = false;
            }
            if(lineCheck) line++;
        }
        for(int i=0; i<5; i++){
            boolean lineCheck = true;
            for(int j=0; j<5; j++){
                if(bingo[j][i] > 0) lineCheck = false;
            }
            if(lineCheck) line++;
        }
        for(int i=0; i<1; i++){
            boolean lineCheck = true;
            for(int j=0; j<5; j++){
                if(bingo[j][j] > 0) lineCheck = false;
            }
            if(lineCheck) line++;
        }
        for(int i=0; i<1; i++){
            boolean lineCheck = true;
            for(int j=0; j<5; j++){
                if(bingo[4-j][j] > 0) lineCheck = false;
            }
            if(lineCheck) line++;
        }
        return line;
    }
}
