import java.io.*;

public class Baekjun_3023 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] arr  = br.readLine().split(" ");
        int r = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[1]);
        char[][] card = new char[r*2][c*2];
        for(int i=0; i<r; i++){
            String line = br.readLine();
            for(int j=0; j<c; j++){
                card[i][j] = line.charAt(j);
            }
        }
        String[] pos = br.readLine().split(" ");
        int x_pos = Integer.parseInt(pos[0]);
        int y_pos = Integer.parseInt(pos[1]);
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                card[i][c*2-j-1] = card[i][j];
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c*2; j++){
                card[r*2-i-1][j] = card[i][j];
            }
        }
        if(card[x_pos-1][y_pos-1] == '#') card[x_pos-1][y_pos-1] = '.';
        else card[x_pos-1][y_pos-1] = '#';
        for(int i=0; i<r*2; i++){
            for(int j=0; j<c*2; j++){
                bw.write(card[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
