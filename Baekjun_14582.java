import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] jeminis = new int[9];
        int[] girlybus = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<9; i++){
            jeminis[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<9; i++){
            girlybus[i] = Integer.parseInt(st.nextToken());
        }
        int jeminisScore = 0;
        int girlybusScore = 0;
        boolean reversal = false;
        for(int i=0; i<9; i++){
            jeminisScore += jeminis[i];
            if(jeminisScore > girlybusScore){
                reversal = true;
                break;
            }
            girlybusScore += girlybus[i];
        }
        if(reversal) System.out.println("Yes");
        else System.out.println("No");
        br.close();
    }
}
