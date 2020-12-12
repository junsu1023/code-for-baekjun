import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_4246 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n==0) break;
            String s = br.readLine();
            int row = s.length()/n;
            int col = n;
            char[][] chr = new char[row][col];
            int idx = 0;
            for(int i=0; i<row; i++){
                if(i%2==0){
                    for(int j=0; j<col; j++){
                        chr[i][j] = s.charAt(idx++);
                    }
                }
                else{
                    for(int j=col-1; j>=0; j--){
                        chr[i][j] = s.charAt(idx++);
                    }
                }
            }
            for(int j=0; j<col; j++){
                for(int i=0; i<row; i++){
                    System.out.print(chr[i][j]);
                }
            }
            System.out.println();
        }
        br.close();
    }
}
