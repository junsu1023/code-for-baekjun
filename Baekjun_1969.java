import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_1969 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        char[][] saveDNA = new char[n][len];
        for(int i=0; i<n; i++){
            String dna = br.readLine();
            for(int j=0; j<len; j++){
                saveDNA[i][j] = dna.charAt(j);
            }
        }
        for(int i=0; i<len; i++){
            int[] kind = new int[4];
            for(int j=0; j<n; j++){
                if(saveDNA[j][i] == 'A') kind[0]++;
                else if(saveDNA[j][i] == 'C') kind[1]++;
                else if(saveDNA[j][i] == 'G') kind[2]++;
                else kind[3]++;
            }
            int max = kind[0];
            int idx = 0;
            for(int j=1; j<4; j++){
                if(kind[j] > max){
                    max = kind[j];
                    idx = j;
                }
            }
            if(idx == 0) sb.append("A");
            else if(idx == 1) sb.append("C");
            else if(idx == 2) sb.append("G");
            else sb.append("T");
        }
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<len; j++){
                if(sb.toString().charAt(j) != saveDNA[i][j]) cnt++;
            }
        }
        System.out.println(sb.toString() + "\n" + cnt);
        br.close();
    }
}
