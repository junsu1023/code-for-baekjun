import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjun_9626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int left = Integer.parseInt(st.nextToken());
        int right = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        String[] word = new String[row];
        for(int i=0; i<row; i++) word[i] = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<row+up+down; i++){
            for(int j=0; j<col+left+right; j++){
                if(i >= up && i < up+row && j >= left && j < left+col){
                    sb.append(word[i-up].charAt(j-left));
                    continue;
                }
                if(i % 2 == 0){
                    if(j % 2 == 0) sb.append('#');
                    else sb.append('.');
                }
                else{
                    if(j % 2 == 0) sb.append('.');
                    else sb.append('#');
                }
            }
            if(i!=row+up+down-1) sb.append("\n");
        }
        System.out.print(sb.toString());
        br.close();
    }
}
