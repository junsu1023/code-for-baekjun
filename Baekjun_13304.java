import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjun_13304 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int room = 0;
        int[][] student = new int[2][7];
        for(int i=0; i<n; i++){
            String[] sy = br.readLine().split(" ");
            int s = Integer.parseInt(sy[0]);
            int y = Integer.parseInt(sy[1]);
            student[s][y]++;
        }
        int ot = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                ot += student[i][j];
            }
        }
        room += ot/k;
        if(ot%k != 0) room++;
        for(int i=0; i<2; i++){
            for(int j=3; j<7; j+=2){
                room += (student[i][j] + student[i][j+1]) / k;
                if((student[i][j] + student[i][j+1]) % k != 0) room++;
            }
        }
        bw.write(room + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
