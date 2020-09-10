import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjun_2999 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();
        int r = 0, c = 0;
        for(int i=1; i<=Math.sqrt(len); i++){
            if(len%i==0) r = i;
        }
        c = len/r;
        char[][] arr = new char[101][101];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                arr[i][j] = s.charAt(i*r+j);
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[j][i]);
            }
        }
        br.close();
    }
}
